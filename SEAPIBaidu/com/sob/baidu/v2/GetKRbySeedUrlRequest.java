/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.GetKRbySeedUrlRequest.java
 */
package sob.baidu.v2;

/**
 * @author blackcore
 * @date 2013-9-25 обнГ3:50:06
 * 
 */
public class GetKRbySeedUrlRequest {
	private SeedFilter seedFilter;
	private String url;

	public GetKRbySeedUrlRequest() {
	}

	public SeedFilter getSeedFilter() {
		return seedFilter;
	}

	public void setSeedFilter(SeedFilter value) {
		seedFilter = value;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String value) {
		url = value;
	}
}
