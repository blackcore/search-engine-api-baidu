/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.GetSeedUrlResponse.java
 */
package sob.baidu.v2;

import java.util.List;

/**
 * @author blackcore
 * @date 2013-9-25 обнГ3:49:04
 * 
 */
public class GetSeedUrlResponse {
	private List<SeedUrl> seedUrls;

	public GetSeedUrlResponse() {
	}

	public List<SeedUrl> getSeedUrls() {
		return seedUrls;
	}

	public void setSeedUrls(List<SeedUrl> value) {
		seedUrls = value;
	}
}
