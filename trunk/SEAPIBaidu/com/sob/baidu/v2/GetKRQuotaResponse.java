/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.GetKRQuotaResponse.java
 */
package sob.baidu.v2;

/**
 * @author blackcore
 * @date 2013-9-25 обнГ3:48:56
 * 
 */
public class GetKRQuotaResponse {
	private long remain;
	private long total;

	public GetKRQuotaResponse() {
	}

	public long getRemain() {
		return remain;
	}

	public void setRemain(long value) {
		remain = value;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long value) {
		total = value;
	}
}
