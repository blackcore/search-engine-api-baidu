/**
 * 
 * SEAPIBaidu
 * sob.baidu.core.GZIPJsonConnection.java
 */
package sob.baidu.core;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import sob.baidu.exception.ApiException;

/**
 * @author blackcore
 * @date 2013-9-25 ÏÂÎç3:21:53
 * 
 */
public class GZIPJsonConnection extends JsonConnection {

	public GZIPJsonConnection(String url) throws MalformedURLException, IOException {
		// super(url);
		super((new StringBuilder(String.valueOf(url))).append("/gzip").toString());
	}

	protected InputStream readResponse() throws ApiException {
		try {
			return new GZIPInputStream(super.readResponse());
		} catch (IOException e) {
			throw new ApiException(e);
		}
	}

	protected OutputStream sendRequest() throws ApiException {
		try {
			return new GZIPOutputStream(super.sendRequest());
		} catch (IOException e) {
			throw new ApiException(e);
		}
	}
}
