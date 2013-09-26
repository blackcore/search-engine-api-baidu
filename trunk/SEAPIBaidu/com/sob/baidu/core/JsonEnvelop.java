/**
 * 
 * SEAPIBaidu
 * sob.baidu.core.JsonEnvelop.java
 */
package sob.baidu.core;

/**
 * 
 * @author blackcore
 * @date 2013-9-25 下午6:06:14
 * 
 * @param <ResHeader>
 *            返回头信息
 * @param <ResBody>
 *            返回主体信息
 */
public class JsonEnvelop<ResHeader, K> {
	private ResHeader header;
	private K body;

	public JsonEnvelop() {
	}

	public ResHeader getHeader() {
		return header;
	}

	public void setHeader(ResHeader header) {
		this.header = header;
	}

	public K getBody() {
		return body;
	}

	public void setBody(K body) {
		this.body = body;
	}
}
