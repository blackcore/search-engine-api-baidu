/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.SeedUrl.java
 */
package sob.baidu.v2;

import java.util.List;

/**
 * @author blackcore
 * @date 2013-9-26 ����10:58:28
 * 
 */
public class SeedUrl {

	private List<String> urlTag;
	private String url;

	public SeedUrl() {
	}

	/**
	 * ����url����������
	 */
	public List<String> getUrlTag() {
		return urlTag;
	}

	public void setUrlTag(List<String> value) {
		urlTag = value;
	}

	/**
	 * ϵͳ�����Ƽ����û�������url��������1017�ֽ�
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
