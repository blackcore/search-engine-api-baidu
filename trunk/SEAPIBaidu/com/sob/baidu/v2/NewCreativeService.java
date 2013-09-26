/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.NewCreativeService.java
 */
package sob.baidu.v2;

/**
 * @author blackcore
 * @date 2013-9-26 ÉÏÎç11:07:59
 * @category NewCreativeService
 * @see com.baidu.api.v2
 * @see url {@link https://api.baidu.com/sem/sms/v2/NewCreativeService?wsdl}
 * @description ²éÔÄreadme.txt
 */
public interface NewCreativeService {
	public abstract AddSublinkResponse addSublink(AddSublinkRequest addsublinkrequest);

	public abstract GetSublinkBySublinkIdResponse getSublinkBySublinkId(GetSublinkBySublinkIdRequest getsublinkbysublinkidrequest);

	public abstract GetSublinkIdByAdgroupIdResponse getSublinkIdByAdgroupId(GetSublinkIdByAdgroupIdRequest getsublinkidbyadgroupidrequest);

	public abstract DeleteSublinkResponse deleteSublink(DeleteSublinkRequest deletesublinkrequest);

	public abstract UpdateSublinkResponse updateSublink(UpdateSublinkRequest updatesublinkrequest);
}
