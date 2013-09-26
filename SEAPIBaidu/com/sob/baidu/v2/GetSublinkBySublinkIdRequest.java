/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.GetSublinkBySublinkIdRequest.java
 */
package sob.baidu.v2;

import java.util.List;

/**
 * @author blackcore
 * @date 2013-9-26 ионГ11:22:29
 * 
 */
public class GetSublinkBySublinkIdRequest {
	private Integer getTemp;
	private List<Long> sublinkIds;

	public GetSublinkBySublinkIdRequest() {
	}

	public Integer getGetTemp() {
		return getTemp;
	}

	public void setGetTemp(Integer value) {
		getTemp = value;
	}

	public List<Long> getSublinkIds() {
		return sublinkIds;
	}

	public void setSublinkIds(List<Long> value) {
		sublinkIds = value;
	}
}
