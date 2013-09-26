/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.GetKRbySeedWordRequest.java
 */
package sob.baidu.v2;

/**
 * @author blackcore
 * @date 2013-9-25 обнГ3:50:15
 * 
 */
public class GetKRbySeedWordRequest {
	public SeedFilter seedFilter;
	public String seedWord;

	public GetKRbySeedWordRequest() {
	}

	public SeedFilter getSeedFilter() {
		return seedFilter;
	}

	public void setSeedFilter(SeedFilter value) {
		seedFilter = value;
	}

	public String getSeedWord() {
		return seedWord;
	}

	public void setSeedWord(String value) {
		seedWord = value;
	}
}
