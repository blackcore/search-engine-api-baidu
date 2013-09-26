/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.GetKRCustomResponse.java
 */
package sob.baidu.v2;

import java.util.List;

/**
 * @author blackcore
 * @date 2013-9-25 обнГ3:49:12
 * 
 */
public class GetKRCustomResponse {
	public List<KRResult> krResult;

	public GetKRCustomResponse() {
	}

	public List<KRResult> getKrResult() {
		return krResult;
	}

	public void setKrResult(List<KRResult> value) {
		krResult = value;
	}
}
