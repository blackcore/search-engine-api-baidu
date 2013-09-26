/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.GetKRByMultiSeedWordResponse.java
 */
package sob.baidu.v2;

import java.util.List;

/**
 * @author blackcore
 * @date 2013-9-25 обнГ3:47:16
 * 
 */
public class GetKRByMultiSeedWordResponse {
	private List<KRResult> krResult;

	public GetKRByMultiSeedWordResponse() {
	}

	public List<KRResult> getKrResult() {
		return krResult;
	}

	public void setKrResult(List<KRResult> value) {
		krResult = value;
	}
}
