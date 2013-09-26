/**
 * 
 * SEAPIBaidu
 * sob.baidu.core.Constants.java
 */
package sob.baidu.core;

/**
 * @author blackcore
 * @date 2013-9-26 上午9:27:39
 * 
 */
public class Constants {
	/**
	 * 推荐关键词
	 */
	public static final String V2_API_KRService = "KRService";
	public static final String V2_API_KRService_getSeedWord = "getSeedWord";
	/**
	 * 根据输入的种子词返回推荐的扩展词，一次调用仅允许请求1 个种子词
	 */
	public static final String V2_API_KRService_getKRbySeedWord = "getKRbySeedWord";
	/**
	 * 异步接口，根据输入的种子词返回推荐的扩展词，一次调用允许请求100个种子词
	 */
	public static final String V2_API_KRService_getKRFileIdbySeedWord = "getKRFileIdbySeedWord";

}
