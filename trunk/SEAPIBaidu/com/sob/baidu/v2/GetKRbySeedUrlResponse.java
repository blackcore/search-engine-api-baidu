/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.GetKRbySeedUrlResponse.java
 */
package sob.baidu.v2;

import java.util.List;

/**
 * @author blackcore
 * @date 2013-9-25 обнГ3:47:38
 * 
 */
public class GetKRbySeedUrlResponse {
	private List<KRResult> krResult;

	public GetKRbySeedUrlResponse() {
	}

	public List<KRResult> getKrResult() {
		return krResult;
	}

	public void setKrResult(List<KRResult> value) {
		krResult = value;
	}
}
