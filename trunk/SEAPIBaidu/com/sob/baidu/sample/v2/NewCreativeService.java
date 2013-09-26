/**
 * 
 * SEAPIBaidu
 * sob.baidu.sample.v2.NewCreativeService.java
 */
package sob.baidu.sample.v2;

import java.util.List;

import sob.baidu.core.CommercialClient;
import sob.baidu.core.Constants;
import sob.baidu.core.JsonEnvelop;
import sob.baidu.core.ResHeader;
import sob.baidu.exception.ApiException;
import sob.baidu.sample.ApiAuthor;
import sob.baidu.v2.AddSublinkRequest;

/**
 * @author blackcore
 * @date 2013-9-26 ÉÏÎç11:41:11
 * 
 */
public class NewCreativeService {

	public static CommercialClient client;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		addSublink();
	}

	static void init(String apiMethod) {
		try {
			client = new CommercialClient(ApiAuthor.username, ApiAuthor.password, ApiAuthor.token, "", Constants.V2_API_NewCreativeService, apiMethod);
		} catch (ApiException e) {
			System.out.println(e.getMessage());
		}
	}

	static void addSublink() {
		init(Constants.V2_API_NewCreativeService_addSublink);
		AddSublinkRequest request = new AddSublinkRequest();
		System.out.println(request.toString());
	}

}
