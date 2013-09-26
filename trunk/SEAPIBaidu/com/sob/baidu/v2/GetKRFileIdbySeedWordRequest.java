/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.GetKRFileIdbySeedWordRequest.java
 */
package sob.baidu.v2;

import java.util.List;

/**
 * @author blackcore
 * @date 2013-9-25 下午3:49:59
 * 
 */
public class GetKRFileIdbySeedWordRequest {
	private SeedFilter seedFilter;
	private List<String> seedWords;

	public GetKRFileIdbySeedWordRequest() {
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

	/**
	 * 请求的种子数
	 * 
	 * @param value
	 */
	public void setSeedWords(List<String> value) {
		seedWords = value;
	}
}
