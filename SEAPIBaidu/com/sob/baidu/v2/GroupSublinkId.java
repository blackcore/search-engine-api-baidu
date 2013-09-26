/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.GroupSublinkId.java
 */
package sob.baidu.v2;

import java.util.List;

/**
 * @author blackcore
 * @date 2013-9-26 ионГ11:48:52
 * 
 */
public class GroupSublinkId {
	private List<Long> sublinkIds;
	private Long adgroupId;

	public GroupSublinkId() {
	}

	public List<Long> getSublinkIds() {
		return sublinkIds;
	}

	public void setSublinkIds(List<Long> value) {
		sublinkIds = value;
	}

	public Long getAdgroupId() {
		return adgroupId;
	}

	public void setAdgroupId(Long value) {
		adgroupId = value;
	}
}
