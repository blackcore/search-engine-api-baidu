/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.SeedUrl.java
 */
package sob.baidu.v2;

import java.util.List;

/**
 * @author blackcore
 * @date 2013-9-26 上午10:58:28
 * 
 */
public class SeedUrl {

	private List<String> urlTag;
	private String url;

	public SeedUrl() {
	}

	/**
	 * 种子url的描述词组
	 */
	public List<String> getUrlTag() {
		return urlTag;
	}

	public void setUrlTag(List<String> value) {
		urlTag = value;
	}

	/**
	 * 系统主动推荐给用户的种子url，不超过1017字节
	 * 
	 * @return
	 */
	public String getUrl() {
		return url;
	}

	public void setUrl(String value) {
		url = value;
	}
}
