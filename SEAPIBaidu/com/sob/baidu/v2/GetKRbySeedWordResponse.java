/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.GetKRbySeedWordResponse.java
 */
package sob.baidu.v2;

import java.util.List;

/**
 * @author blackcore
 * @date 2013-9-25 обнГ3:47:49
 * 
 */
public class GetKRbySeedWordResponse {
	public List<KRResult> krResult;

	public GetKRbySeedWordResponse() {
	}

	public List<KRResult> getKrResult() {
		return krResult;
	}

	public void setKrResult(List<KRResult> value) {
		krResult = value;
	}
}
