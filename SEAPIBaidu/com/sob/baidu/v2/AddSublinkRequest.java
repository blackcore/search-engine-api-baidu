/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.AddSublinkRequest.java
 */
package sob.baidu.v2;

import java.util.List;

/**
 * @author blackcore
 * @date 2013-9-26 ÉÏÎç11:22:13
 * 
 */
public class AddSublinkRequest {
	private List<SublinkType> sublinkTypes;

	public AddSublinkRequest() {
	}

	public List<SublinkType> getSublinkTypes() {
		return sublinkTypes;
	}

	public void setSublinkTypes(List<SublinkType> value) {
		sublinkTypes = value;
	}
}
