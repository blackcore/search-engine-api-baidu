/**
 * 
 * SEAPIBaidu
 * sob.baidu.v2.GetKRFileIdbySeedWordResponse.java
 */
package sob.baidu.v2;

/**
 * @author blackcore
 * @date 2013-9-25 下午3:47:27
 * 
 */
public class GetKRFileIdbySeedWordResponse {
	private String krFileId;

	public GetKRFileIdbySeedWordResponse() {
	}

	/**
	 * 关键词推荐处理任务id
	 */
	public String getKrFileId() {
		return krFileId;
	}

	public void setKrFileId(String value) {
		krFileId = value;
	}
}
