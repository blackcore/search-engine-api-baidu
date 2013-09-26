/**
 * 
 */
package sob.baidu.exception;

/**
 * @author blackcore
 * @date 2013-9-25 обнГ3:09:20
 * 
 */
public class ApiException extends Exception {	

	/**
	 * 
	 */
	private static final long serialVersionUID = -4888329746989181727L;

	public ApiException() {
	}

	public ApiException(String msg) {
		super(msg);
	}

	public ApiException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public ApiException(Throwable cause) {
		super(cause);
	}

	public ApiException(String msg, int errorCode) {
		super((new StringBuilder("ErrorCode : ")).append(errorCode).append(", info : ").append(msg).toString());
	}
}
