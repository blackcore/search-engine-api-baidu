/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.GetKRFileIdbySeedWordRequest.java
 */
package sob.baidu.v2;

import java.util.List;

/**
 * @author blackcore
 * @date 2013-9-25 обнГ3:49:59
 * 
 */
public class GetKRFileIdbySeedWordRequest {
	public SeedFilter seedFilter;
	public List seedWords;

	public GetKRFileIdbySeedWordRequest() {
	}

	public SeedFilter getSeedFilter() {
		return seedFilter;
	}

	public void setSeedFilter(SeedFilter value) {
		seedFilter = value;
	}

	public List getSeedWords() {
		return seedWords;
	}

	public void setSeedWords(List value) {
		seedWords = value;
	}
}
