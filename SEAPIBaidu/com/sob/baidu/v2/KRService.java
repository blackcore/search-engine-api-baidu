/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.IKRService.java
 */
package sob.baidu.v2;

/**
 * @author blackcore
 * @date 2013-9-25 ����3:46:08
 * @category KRService
 * @see com.baidu.api.v2
 * @see url {@link https://api.baidu.com/sem/sms/v2/KRService?wsdl}
 * @see 1. �Ƽ��ؼ���
 * @see 1.1 Service KRService
 * @see 1.2 Method ��10�����������£�
 * @see getKRFileState: GetKRFileStateRequest, GetKRFileStateResponse,
 * @see getetKRByMultiSeed:
 *      GetKRByMultiSeedWordRequest,GetKRByMultiSeedWordResponse,
 * @see getKRFileIdbySeedWord:
 *      GetKRFileIdbySeedWordRequest,GetKRFileIdbySeedWordResponse,
 * @see getKRbySeedUrl: GetKRbySeedUrlRequest, GetKRbySeedUrlResponse,
 * @see getKRbySeedWord: GetKRbySeedWordRequest, GetKRbySeedWordResponse,
 * @see getSeedWord: GetSeedWordRequest, GetSeedWordResponse,
 * @see getKRQuota: GetKRQuotaRequest, GetKRQuotaResponse,
 * @see getKRFilePath: GetKRFilePathRequest, GetKRFilePathResponse,
 * @see getSeedUrl: GetSeedUrlRequest, GetSeedUrlResponse,
 * @see getKRCustom: GetKRCustomRequest, GetKRCustomResponse
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
