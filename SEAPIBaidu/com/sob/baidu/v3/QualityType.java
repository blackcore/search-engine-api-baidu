/**
 * 
 * SEAPIBaidu
 * sob.baidu.v3.QualityType.java
 */
package sob.baidu.v3;

/**
 * @author blackcore
 * @date 2013-9-25 ÏÂÎç5:48:44
 * 
 */
public class QualityType {
	public int mobileQuality;
	public int quality;
	public long campaignId;
	public long adgroupId;
	public long id;

	public QualityType() {
	}

	public int getMobileQuality() {
		return mobileQuality;
	}

	public void setMobileQuality(int value) {
		mobileQuality = value;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int value) {
		quality = value;
	}

	public long getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(long value) {
		campaignId = value;
	}

	public long getAdgroupId() {
		return adgroupId;
	}

	public void setAdgroupId(long value) {
		adgroupId = value;
	}

	public long getId() {
		return id;
	}

	public void setId(long value) {
		id = value;
	}
}
