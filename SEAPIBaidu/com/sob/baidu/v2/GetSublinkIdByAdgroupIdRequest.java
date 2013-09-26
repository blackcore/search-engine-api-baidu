/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.GetSublinkIdByAdgroupIdRequest.java
 */
package sob.baidu.v2;

import java.util.List;

/**
 * @author blackcore
 * @date 2013-9-26 ионГ11:22:42
 * 
 */
public class GetSublinkIdByAdgroupIdRequest {
	private Integer getTemp;
	private List<Long> adgroupIds;

	public GetSublinkIdByAdgroupIdRequest() {
	}

	public Integer getGetTemp() {
		return getTemp;
	}

	public void setGetTemp(Integer value) {
		getTemp = value;
	}

	public List<Long> getAdgroupIds() {
		return adgroupIds;
	}

	public void setAdgroupIds(List<Long> value) {
		adgroupIds = value;
	}
}
