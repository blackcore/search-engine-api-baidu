/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.GetSublinkBySublinkIdResponse.java
 */
package sob.baidu.v2;

import java.util.List;

/**
 * @author blackcore
 * @date 2013-9-26 ÉÏÎç11:22:22
 * 
 */
public class GetSublinkBySublinkIdResponse {
	private List<SublinkType> sublinkTypes;

	public GetSublinkBySublinkIdResponse() {
	}

	public List<SublinkType> getSublinkTypes() {
		return sublinkTypes;
	}

	public void setSublinkTypes(List<SublinkType> value) {
		sublinkTypes = value;
	}
}
