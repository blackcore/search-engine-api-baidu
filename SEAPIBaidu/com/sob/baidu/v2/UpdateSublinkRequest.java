/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.UpdateSublinkRequest.java
 */
package sob.baidu.v2;

import java.util.List;

/**
 * @author blackcore
 * @date 2013-9-26 ÉÏÎç11:23:09
 * 
 */
public class UpdateSublinkRequest {
	private List<SublinkType> sublinkTypes;

	public UpdateSublinkRequest() {
	}

	public List<SublinkType> getSublinkTypes() {
		return sublinkTypes;
	}

	public void setSublinkTypes(List<SublinkType> value) {
		sublinkTypes = value;
	}
}
