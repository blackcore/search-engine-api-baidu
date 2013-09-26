/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.GetKRByMultiSeedWordRequest.java
 */
package sob.baidu.v2;

import java.util.List;

/**
 * @author blackcore
 * @date 2013-9-25 обнГ3:49:52
 * 
 */
public class GetKRByMultiSeedWordRequest {
	private SeedFilter seedFilter;
	private List<String> seedWords;

	public GetKRByMultiSeedWordRequest() {
	}

	public SeedFilter getSeedFilter() {
		return seedFilter;
	}

	public void setSeedFilter(SeedFilter value) {
		seedFilter = value;
	}

	public List<String> getSeedWords() {
		return seedWords;
	}

	public void setSeedWords(List<String> value) {
		seedWords = value;
	}
}
