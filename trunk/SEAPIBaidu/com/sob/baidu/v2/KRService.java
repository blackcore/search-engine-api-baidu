/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.IKRService.java
 */
package sob.baidu.v2;

/**
 * @author blackcore
 * @date 2013-9-25 ÏÂÎç3:46:08
 * 
 */
public interface KRService {
	public abstract GetKRFileStateResponse getKRFileState(GetKRFileStateRequest getkrfilestaterequest);

	public abstract GetKRByMultiSeedWordResponse getKRByMultiSeedWord(GetKRByMultiSeedWordRequest getkrbymultiseedwordrequest);

	public abstract GetKRFileIdbySeedWordResponse getKRFileIdbySeedWord(GetKRFileIdbySeedWordRequest getkrfileidbyseedwordrequest);

	public abstract GetKRbySeedUrlResponse getKRbySeedUrl(GetKRbySeedUrlRequest getkrbyseedurlrequest);

	public abstract GetKRbySeedWordResponse getKRbySeedWord(GetKRbySeedWordRequest getkrbyseedwordrequest);

	public abstract GetSeedWordResponse getSeedWord(GetSeedWordRequest getseedwordrequest);

	public abstract GetKRQuotaResponse getKRQuota(GetKRQuotaRequest getkrquotarequest);

	public abstract GetKRFilePathResponse getKRFilePath(GetKRFilePathRequest getkrfilepathrequest);

	public abstract GetSeedUrlResponse getSeedUrl(GetSeedUrlRequest getseedurlrequest);

	public abstract GetKRCustomResponse getKRCustom(GetKRCustomRequest getkrcustomrequest);
}
