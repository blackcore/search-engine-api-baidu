/**
 * 
 * SEAPIBaidu
 * sob.baidu.v3.KW.KeywordService.java
 */
package sob.baidu.v3;

/**
 * @author blackcore
 * @date 2013-9-25 ÏÂÎç5:26:23
 * 
 */
public interface KeywordService {
	public abstract AddKeywordResponse addKeyword(AddKeywordRequest addkeywordrequest);

	public abstract GetKeywordStatusZipResponse getKeywordStatusZip(GetKeywordStatusZipRequest getkeywordstatusziprequest);

	public abstract UpdateKeywordResponse updateKeyword(UpdateKeywordRequest updatekeywordrequest);

	public abstract DeleteKeywordResponse deleteKeyword(DeleteKeywordRequest deletekeywordrequest);

	public abstract GetKeywordStatusResponse getKeywordStatus(GetKeywordStatusRequest getkeywordstatusrequest);

	public abstract GetKeywordQualityZipResponse getKeywordQualityZip(GetKeywordQualityZipRequest getkeywordqualityziprequest);

	public abstract GetKeywordByKeywordIdResponse getKeywordByKeywordId(GetKeywordByKeywordIdRequest getkeywordbykeywordidrequest);

	public abstract GetKeywordIdByAdgroupIdResponse getKeywordIdByAdgroupId(GetKeywordIdByAdgroupIdRequest getkeywordidbyadgroupidrequest);

	public abstract ActivateKeywordResponse activateKeyword(ActivateKeywordRequest activatekeywordrequest);

	public abstract GetKeywordByAdgroupIdResponse getKeywordByAdgroupId(GetKeywordByAdgroupIdRequest getkeywordbyadgroupidrequest);

	public abstract GetKeywordQualityResponse getKeywordQuality(GetKeywordQualityRequest getkeywordqualityrequest);
}
