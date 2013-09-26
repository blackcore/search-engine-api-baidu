/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.SublinkType.java
 */
package sob.baidu.v2;

import java.util.List;

/**
 * @author blackcore
 * @date 2013-9-26 ÉÏÎç11:46:24
 * 
 */
public class SublinkType {
	private Integer status;
	private Boolean pause;
	private Long adgroupId;
	private List<SublinkInfo> sublinkInfos;
	private Long sublinkId;

	public SublinkType() {
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer value) {
		status = value;
	}

	public Boolean getPause() {
		return pause;
	}

	public void setPause(Boolean value) {
		pause = value;
	}

	public Long getAdgroupId() {
		return adgroupId;
	}

	public void setAdgroupId(Long value) {
		adgroupId = value;
	}

	public List<SublinkInfo> getSublinkInfos() {
		return sublinkInfos;
	}

	public void setSublinkInfos(List<SublinkInfo> value) {
		sublinkInfos = value;
	}

	public Long getSublinkId() {
		return sublinkId;
	}

	public void setSublinkId(Long value) {
		sublinkId = value;
	}
}
