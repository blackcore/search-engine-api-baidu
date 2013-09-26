/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.GetSublinkIdByAdgroupIdResponse.java
 */
package sob.baidu.v2;

import java.util.List;

/**
 * @author blackcore
 * @date 2013-9-26 ионГ11:22:36
 * 
 */
public class GetSublinkIdByAdgroupIdResponse {
	private List<GroupSublinkId> groupSublinkIds;

	public GetSublinkIdByAdgroupIdResponse() {
	}

	public List<GroupSublinkId> getGroupSublinkIds() {
		return groupSublinkIds;
	}

	public void setGroupSublinkIds(List<GroupSublinkId> value) {
		groupSublinkIds = value;
	}
}
