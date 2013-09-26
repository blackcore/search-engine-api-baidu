/**
 * 
 * SEAPIBaidu
 * sob.baidu.sample.v2.KRService.java
 */
package sob.baidu.sample.v2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import sob.baidu.core.CommercialClient;
import sob.baidu.core.JsonEnvelop;
import sob.baidu.core.ResHeader;
import sob.baidu.exception.ApiException;
import sob.baidu.sample.ApiAuthor;
import sob.baidu.v2.GetKRFileIdbySeedWordRequest;
import sob.baidu.v2.GetKRFileIdbySeedWordResponse;
import sob.baidu.v2.GetKRQuotaRequest;
import sob.baidu.v2.GetKRQuotaResponse;
import sob.baidu.v2.GetKRbySeedWordRequest;
import sob.baidu.v2.GetKRbySeedWordResponse;
import sob.baidu.v2.KRResult;

/**
 * @author blackcore
 * @date 2013-9-25 下午5:15:46
 * 
 */
public class KRService {

	public static CommercialClient client;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// getKRQuota();
		// getKRFileIdbySeedWord();
		getKRByseedWord();
	}

	static void init(String apiMethod) {
		try {
			client = new CommercialClient(ApiAuthor.username, ApiAuthor.password, ApiAuthor.token, "", sob.baidu.core.Constants.V2_API_KRService, apiMethod);
		} catch (ApiException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * getKRByseedWord
	 */
	static void getKRByseedWord() {
		init(sob.baidu.core.Constants.V2_API_KRService_getKRbySeedWord);
		GetKRbySeedWordRequest request = new GetKRbySeedWordRequest();
		request.setSeedWord("手机");

		CommercialClient currentClient;
		JsonEnvelop<ResHeader, GetKRbySeedWordResponse> envelop;
		try {
			envelop = (JsonEnvelop<ResHeader, GetKRbySeedWordResponse>) client.execute(request);

			ResHeader resHeader = envelop.getHeader();
			System.out.println(resHeader.toString());
			System.out.println(envelop.getBody().toString());
			GetKRbySeedWordResponse response = envelop.getBody();
			System.out.println(response.getKrResult());
			List<KRResult> krResults = response.getKrResult();
			if (krResults != null && krResults.size() > 0) {
				for (KRResult item : krResults) {
					System.out.println(new StringBuilder().append("word:").append(item.getWord()).append("\tgroup:").append(item.getGroup()).append("\tcompetition:").append(item.getCompetition()));
				}
			} else {
				System.out.println("结果为空！");
			}
		} catch (ApiException e) {
			System.out.println(e.getMessage());
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * getKRFileIdbySeedWord 返回任务id,通过任务id下载文件
	 */
	static void getKRFileIdbySeedWord() {
		init(sob.baidu.core.Constants.V2_API_KRService_getKRFileIdbySeedWord);
		GetKRFileIdbySeedWordRequest request = new GetKRFileIdbySeedWordRequest();
		ArrayList<String> seedwords = new ArrayList<String>();
		seedwords.add("手机");
		request.setSeedWords(seedwords);
		JsonEnvelop<ResHeader, GetKRFileIdbySeedWordResponse> envelop;
		try {
			envelop = (JsonEnvelop<ResHeader, GetKRFileIdbySeedWordResponse>) client.execute(request);

			ResHeader resHeader = envelop.getHeader();
			System.out.println(resHeader.toString());
			System.out.println(envelop.getBody().toString());
			GetKRFileIdbySeedWordResponse response = envelop.getBody();
			System.out.println(response.getKrFileId());// f21d8708c805804b4b2f74cf01b5ee4b
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
	}

	static void getKRQuota() {
		try {
			JsonEnvelop<ResHeader, GetKRQuotaResponse> env;
			client = new CommercialClient(ApiAuthor.username, ApiAuthor.password, ApiAuthor.token, "", "KRService", "getKRQuota");

			GetKRQuotaRequest request = new GetKRQuotaRequest();

			env = (JsonEnvelop<ResHeader, GetKRQuotaResponse>) client.execute(request);
			ResHeader resHeader = env.getHeader();

			System.out.println(resHeader.toString());
			System.out.println(env.getBody().toString());
			GetKRQuotaResponse response = (GetKRQuotaResponse) env.getBody();
			System.out.println("getRemain:\t" + response.getRemain());
			System.out.println("getTotal:\t" + response.getTotal());

		} catch (ApiException e) {
			System.out.println(e.getMessage());
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
	}

}
