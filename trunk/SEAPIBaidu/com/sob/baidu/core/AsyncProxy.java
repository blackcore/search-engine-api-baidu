/**
 * 
 */
package sob.baidu.core;

/**
 * @author blackcore
 * @date 2013-9-25 обнГ3:05:14
 * 
 */
public class AsyncProxy implements Runnable {

	private JsonProxy proxy;
	private Object req;
	private ICallback callback;

	public AsyncProxy(JsonProxy proxy, Object req, ICallback callback) {
		this.proxy = proxy;
		this.req = req;
		this.callback = callback;
	}

	@Override
	public void run() {
		try {
			JsonEnvelop<?, ?> res = proxy.execute(req);
			callback.execResult(res);
		} catch (Throwable e) {
			e.printStackTrace();
			callback.execError(e);
		}
	}

}
