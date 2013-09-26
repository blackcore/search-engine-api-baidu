/**
 * 
 * SEAPIBaidu
 * sob.baidu.core.CommercialClient.java
 */
package sob.baidu.core;

import sob.baidu.exception.ApiException;

/**
 * @author blackcore
 * @date 2013-9-25 ÏÂÎç3:40:18
 * 
 */
public class CommercialClient {
	private JsonProxy proxy;

	public CommercialClient(String username, String password, String token, String target, String service, String method) throws ApiException {
		proxy = new JsonProxy(service, method, username, password, token, target);
	}

	public JsonEnvelop<?, ?> execute(Object req) throws Throwable {
		return proxy.execute(req);
	}

	public void execute(Object req, ICallback callback) throws Throwable {
		proxy.execute(req, callback);
	}
}
