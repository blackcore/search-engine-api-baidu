/**
 * 
 * SEAPIBaidu
 * sob.baidu.core.JsonProxy.java
 */
package sob.baidu.core;

import java.lang.reflect.Method;

import sob.baidu.exception.ApiException;

/**
 * @author blackcore
 * @date 2013-9-25 ÏÂÎç3:30:18
 * 
 */
public class JsonProxy {
	private Class<?> cls;
	private String url;
	private String method;
	private AuthHeader authHeader;

	public JsonProxy(String service, String method, String username, String password, String token, String target) throws ApiException {
		try {
			cls = Class.forName(CommonUtils.getCls(service, method));
		} catch (ClassNotFoundException e) {
			throw new ApiException("Can't find service!", e);
		}
		url = CommonUtils.getURL(service, method);
		authHeader = CommonUtils.getAuthHeader(username, password, token, target);
		this.method = method;
	}

	public JsonEnvelop<?, ?> execute(Object req) throws Throwable {
		JsonConnection conn = new GZIPJsonConnection(url);
		conn.sendRequest(makeRequest(req));
		JsonEnvelop<?, ?> response = conn.readResponse(sob.baidu.core.ResHeader.class, getReturnType(cls, method));
		return response;
	}

	public void execute(Object req, ICallback callback) throws Throwable {
		AsyncProxy asyncProxy = new AsyncProxy(this, req, callback);
		Thread thread = new Thread(asyncProxy);
		thread.start();
	}

	private JsonEnvelop<AuthHeader, Object> makeRequest(Object args) {
		JsonEnvelop<AuthHeader, Object> body = new JsonEnvelop<AuthHeader, Object>();
		body.setHeader(authHeader);
		body.setBody(args);
		return body;
	}

	private Class<?> getReturnType(Class<?> cls, String method) throws ApiException {
		Method methods[] = cls.getMethods();
		Method amethod[];
		int j = (amethod = methods).length;
		for (int i = 0; i < j; i++) {
			Method m = amethod[i];
			if (method.equals(m.getName()))
				return m.getReturnType();
		}

		throw new ApiException("Can't find method!");
	}
}
