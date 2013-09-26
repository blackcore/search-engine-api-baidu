/**
 * 
 * SEAPIBaidu
 * sob.baidu.v3.KW.GetKeywordQualityRequest.java
 */
package sob.baidu.v3;

import java.util.List;

/**
 * @author blackcore
 * @date 2013-9-25 обнГ5:30:07
 * 
 */
public class GetKeywordQualityRequest {
	public int type;
	public List ids;

	public GetKeywordQualityRequest() {
	}

	public int getType() {
		return type;
	}

	public void setType(int value) {
		type = value;
	}

	public List getIds() {
		return ids;
	}

	public void setIds(List value) {
		ids = value;
	}
}
