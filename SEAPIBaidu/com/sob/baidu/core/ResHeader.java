/**
 * 
 * SEAPIBaidu
 * sob.baidu.core.ResHeader.java
 */
package sob.baidu.core;

import java.util.ArrayList;
import java.util.List;

/**
 * @author blackcore
 * @date 2013-9-25 ÏÂÎç3:19:51
 * 
 */
public class ResHeader {
	protected String desc;
	protected List<Failure> failures;
	protected Integer oprs;
	protected Integer oprtime;
	protected Integer quota;
	protected Integer rquota;
	protected int status;

	public ResHeader() {
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String value) {
		desc = value;
	}

	public List<Failure> getFailures() {
		if (failures == null)
			failures = new ArrayList<Failure>();
		return failures;
	}

	public Integer getOprs() {
		return oprs;
	}

	public void setOprs(Integer value) {
		oprs = value;
	}

	public Integer getOprtime() {
		return oprtime;
	}

	public void setOprtime(Integer value) {
		oprtime = value;
	}

	public Integer getQuota() {
		return quota;
	}

	public void setQuota(Integer value) {
		quota = value;
	}

	public Integer getRquota() {
		return rquota;
	}

	public void setRquota(Integer value) {
		rquota = value;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int value) {
		status = value;
	}

	public String toString() {
		return (new StringBuilder("ResHeader [desc=")).append(desc).append(", failures=").append(failures).append(", oprs=").append(oprs).append(", oprtime=").append(oprtime).append(", quota=")
				.append(quota).append(", rquota=").append(rquota).append(", status=").append(status).append("]").toString();
	}
}
