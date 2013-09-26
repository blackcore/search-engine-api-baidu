/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.GetKRCustomRequest.java
 */
package sob.baidu.v2;

/**
 * @author blackcore
 * @date 2013-9-25 ����3:50:44
 * 
 */
public class GetKRCustomRequest {
	private SeedFilter seedFilter;
	private int type;
	private Long id;

	public GetKRCustomRequest() {
	}

	public SeedFilter getSeedFilter() {
		return seedFilter;
	}

	public void setSeedFilter(SeedFilter value) {
		seedFilter = value;
	}

	public int getType() {
		return type;
	}

	public void setType(int value) {
		type = value;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long value) {
		id = value;
	}
}
