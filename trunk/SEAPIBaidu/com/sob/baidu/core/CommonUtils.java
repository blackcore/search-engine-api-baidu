/**
 * 
 * SEAPIBaidu
 * sob.baidu.core.CommonUtils.java
 */
package sob.baidu.core;

import java.util.ArrayList;
import java.util.List;

import sob.baidu.exception.ApiException;

/**
 * @author blackcore
 * @date 2013-9-25 ����3:14:57
 * 
 */
public class CommonUtils {
	private static final String NAMESPACE = "https://api.baidu.com/json/sms/";
	private static final String PACKAGE = "sob.baidu.";
	private static final String DOT = ".";
	private static final String SLASH = "/";
	/**
	 * ��Ӧapi v2�汾
	 */
	private static final String V2 = "v2";
	/**
	 * ��Ӧapi v3�汾
	 */
	private static final String V3 = "v3";
	/**
	 * ��Ӧv2�ķ���
	 */
	private static List<String> APIV2;
	/**
	 * ��Ӧv3�ķ���
	 */
	private static List<String> APIV3;

	public CommonUtils() {
	}

	static {
		APIV2 = new ArrayList<String>();
		initV2();
		APIV3 = new ArrayList<String>();
		initV3();
	}

	/**
	 * ��ʼ��v2�汾�ķ���
	 */
	static void initV2() {
		// KRService
		APIV2.add(Constants.V2_API_KRService_getKRByMultiSeedWord);
		APIV2.add(Constants.V2_API_KRService_getKRbySeedUrl);
		APIV2.add(Constants.V2_API_KRService_getKRbySeedWord);
		APIV2.add(Constants.V2_API_KRService_getKRCustom);
		APIV2.add(Constants.V2_API_KRService_getKRFileIdbySeedWord);
		APIV2.add(Constants.V2_API_KRService_getKRFilePath);
		APIV2.add(Constants.V2_API_KRService_getKRFileState);
		APIV2.add(Constants.V2_API_KRService_getKRQuota);
		APIV2.add(Constants.V2_API_KRService_getSeedUrl);
		APIV2.add(Constants.V2_API_KRService_getSeedWord);
		// NewCreativeService
		APIV2.add(Constants.V2_API_NewCreativeService_addSublink);
		// FIXME api v2�ķ�������

	}

	static void initV3() {
		// FIXME api v3�ķ�������
	}

	public static String getURL(String service, String method) throws ApiException {
		StringBuilder url = new StringBuilder();
		url.append(NAMESPACE);
		if (APIV2.contains(method)) {
			url.append(V2);
		} else {
			url.append(V3);
		}
		url.append(SLASH).append(service).append(SLASH);
		url.append(method);
		return url.toString();
	}

	public static AuthHeader getAuthHeader(String username, String password, String token, String target) {
		AuthHeader authHeader = new AuthHeader();
		authHeader.setUsername(username);
		authHeader.setPassword(password);
		authHeader.setToken(token);
		authHeader.setTarget(target);
		return authHeader;
	}

	public static String getCls(String service, String method) {
		StringBuilder cls = new StringBuilder();
		cls.append(PACKAGE);
		if (APIV2.contains(method))
			cls.append(V2);
		else
			cls.append(V3);
		cls.append(DOT).append(service);
		return cls.toString();
	}

}
