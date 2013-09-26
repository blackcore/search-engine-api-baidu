/**
 * 
 */
package sob.baidu.core;

/**
 * @author blackcore
 * @date 2013-9-25 ÏÂÎç3:07:25
 * 
 */
public class AuthHeader {
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	private String username;
	private String password;
	private String target;
	private String token;

	public AuthHeader() {
	}
	
	public String toString()
	{
		
		return (new StringBuilder("AuthHeader [username=")).append(username).append(", password=").append(password).append(", target=").append(target).append(", token=").append(token).append("]").toString();
	}
}
