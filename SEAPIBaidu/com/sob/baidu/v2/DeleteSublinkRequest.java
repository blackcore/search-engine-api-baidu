/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.DeleteSublinkRequest.java
 */
package sob.baidu.v2;

import java.util.List;

/**
 * @author blackcore
 * @date 2013-9-26 ионГ11:22:55
 * 
 */
public class DeleteSublinkRequest {
	private List<Long> sublinkIds;

	public DeleteSublinkRequest() {
	}

	public List<Long> getSublinkIds() {
		return sublinkIds;
	}

	public void setSublinkIds(List<Long> value) {
		sublinkIds = value;
	}
}
