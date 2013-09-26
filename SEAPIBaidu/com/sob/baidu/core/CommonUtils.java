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
	public static final String NAMESPACE = "https://api.baidu.com/json/sms/";
	public static final String PACKAGE = "sob.baidu.";
	private static final String DOT = ".";
	public static final String SLASH = "/";
	/**
	 * ��Ӧapi v2�汾
	 */
	public static final String V2 = "v2";
	/**
	 * ��Ӧapi v3�汾
	 */
	public static final String V3 = "v3";
	/**
	 * ��Ӧv2�ķ���
	 */
	public static List<String> METHODV2;

	public CommonUtils() {
	}

	static {
		METHODV2 = new ArrayList<String>();
		METHODV2.add("getKRFileState");
		METHODV2.add("getKRByMultiSeedWord");
		METHODV2.add("getKRFileIdbySeedWord");
		METHODV2.add("getKRbySeedUrl");
		METHODV2.add("getKRbySeedWord");
		METHODV2.add("getSeedWord");
		METHODV2.add("getKRQuota");
	}

	public static String getURL(String service, String method) throws ApiException {
		StringBuilder url = new StringBuilder();
		url.append(NAMESPACE);
		if (METHODV2.contains(method)) {
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
		if (METHODV2.contains(method))
			cls.append(V2);
		else
			cls.append(V3);
		cls.append(DOT).append(service);
		return cls.toString();
	}

}
