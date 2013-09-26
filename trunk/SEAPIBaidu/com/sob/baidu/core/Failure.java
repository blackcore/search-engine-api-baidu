/**
 * 
 */
package sob.baidu.core;

/**
 * @author blackcore
 * @date 2013-9-25 ÏÂÎç3:10:31
 * 
 */
public class Failure {
	private int code;
	private String message;
	private String position;
	private String content;

	public Failure() {
	}

	public int getCode() {
		return code;
	}

	public void setCode(int value) {
		code = value;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String value) {
		message = value;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String value) {
		position = value;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String value) {
		content = value;
	}

	public String toString() {
		return (new StringBuilder("Failure [code=")).append(code).append(", message=").append(message).append(", position=").append(position).append(", content=").append(content).append("]")
				.toString();
	}
}
