/**
 * 
 * SEAPIBaidu
 * sob.baidu.core.JsonEnvelop.java
 */
package sob.baidu.core;

/**
 * 
 * @author blackcore
 * @date 2013-9-25 ����6:06:14
 * 
 * @param <ResHeader>
 *            ����ͷ��Ϣ
 * @param <ResBody>
 *            ����������Ϣ
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
