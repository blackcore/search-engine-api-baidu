/**
 * 
 */
package sob.baidu.core;

/**
 * @author blackcore
 * @date 2013-9-25 обнГ3:06:57
 * 
 */
public interface ICallback {
	public abstract void execResult(Object obj);

	public abstract void execError(Throwable throwable);
}
