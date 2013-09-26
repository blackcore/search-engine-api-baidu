/**
 * 
 * SEAPIBaidu
 * sob.baidu.sample.v3.KeywordService.java
 */
package sob.baidu.sample.v3;

import java.util.ArrayList;
import java.util.List;

import sob.baidu.core.CommercialClient;
import sob.baidu.core.JsonEnvelop;
import sob.baidu.core.ResHeader;
import sob.baidu.exception.ApiException;
import sob.baidu.v3.GetKeywordQualityRequest;
import sob.baidu.v3.GetKeywordQualityResponse;
import sob.baidu.v3.QualityType;

/**
 * @author blackcore
 * @date 2013-9-25 下午5:30:47
 * 
 */
public class KeywordService {

	public static CommercialClient client;
	public static JsonEnvelop<ResHeader, ?> env;

	private static String username = "345zibolan47";
	private static String password = "Zbl58290217";
	private static String token = "5a2a7eed125124bc4e37b84a72110188";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		getKeywordQuality();
	}

	static void getKeywordQuality() {
		try {
			client = new CommercialClient(username, password, token, "", "KeywordService", "getKeywordQuality");

			GetKeywordQualityRequest request = new GetKeywordQualityRequest();
			List<Long> ids = new ArrayList<Long>();
			request.setIds(ids);
			request.setType(3);
			env = (JsonEnvelop<ResHeader, ?>) client.execute(request);
			ResHeader resHeader = env.getHeader();
			if (resHeader.getStatus() == 0 && resHeader.getDesc().equals("success")) {
				GetKeywordQualityResponse response = new GetKeywordQualityResponse();
				List<QualityType> qualities = response.getQualities();
				if (qualities != null && qualities.size() > 0) {

					for (QualityType item : qualities) {
						System.out.println("CampaignId:\t");
						System.out.print(item.getCampaignId());
						System.out.println("AdgroupId:\t");
						System.out.print(item.getAdgroupId());
						System.out.println("Id:\t");
						System.out.print(item.getId());
						System.out.println("Quality:\t");
						System.out.print(item.getQuality());
						System.out.println("");
					}
				} else {
					System.out.println("获取的结果为空！");
					System.out.println(resHeader.toString());
				}
			} else {
				System.out.println(resHeader.toString());
			}

		} catch (ApiException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		} catch (Throwable e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
	}
}
