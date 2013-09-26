/**
 * 
 * SEAPIBaidu
 * sob.baidu.core.JsonConnection.java
 */
package sob.baidu.core;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.codehaus.jackson.map.type.TypeFactory;

import sob.baidu.exception.ApiException;

/**
 * @author blackcore
 * @date 2013-9-25 ÏÂÎç3:25:16
 * 
 */
public class JsonConnection {
	private HttpURLConnection connection;
	private int connectTimeout;
	private int readTimeout;

	public int getConnectTimeout() {
		return connectTimeout;
	}

	public void setConnectTimeout(int connectTimeout) {
		this.connectTimeout = connectTimeout;
	}

	public int getReadTimeout() {
		return readTimeout;
	}

	public void setReadTimeout(int readTimeout) {
		this.readTimeout = readTimeout;
	}

	public JsonConnection(String url) throws MalformedURLException, IOException {
		connectTimeout = 30000;
		readTimeout = 60000;
		connection = (HttpURLConnection) (new URL(url)).openConnection();
	}

	protected OutputStream sendRequest() throws ApiException {
		OutputStream out = null;
		connection.setConnectTimeout(connectTimeout);
		connection.setReadTimeout(readTimeout);
		try {
			connection.setRequestMethod("POST");
			connection.setUseCaches(false);
			connection.setDoInput(true);
			connection.setDoOutput(true);
			connection.setRequestProperty("Content-Type", "text/json; charset=utf-8");
			connection.connect();
			out = connection.getOutputStream();
		} catch (IOException e) {
			throw new ApiException(e);
		}
		return out;
	}

	public void sendRequest(JsonEnvelop<?, ?> body) throws ApiException {
		OutputStream out = sendRequest();
		try {
			JacksonUtil.writeObj(out, body);
			if (out != null)
				try {
					out.close();
				} catch (IOException e) {
					throw new ApiException(e);
				}
		} catch (Exception e) {
			throw new ApiException(e);
		}
	}

	protected InputStream readResponse() throws ApiException {
		InputStream in = null;
		try {
			if (connection.getResponseCode() == 200)
				in = connection.getInputStream();
			else if (connection.getErrorStream() != null)
				in = connection.getErrorStream();
			else
				in = connection.getInputStream();
		} catch (IOException e) {
			throw new ApiException(e);
		}
		return in;
	}

	public JsonEnvelop<?, ?> readResponse(Class<?> t, Class<?> k) throws ApiException {
		InputStream in;
		in = readResponse();
		JsonEnvelop<?, ?> jsonenvelop;
		try {
			jsonenvelop = (JsonEnvelop<?, ?>) JacksonUtil.readObj(in, TypeFactory.parametricType(sob.baidu.core.JsonEnvelop.class, new Class[] { t, k }));
		} catch (IOException e) {
			throw new ApiException(e);
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					throw new ApiException(e);
				}
			}
		}
		return jsonenvelop;

	}
}
