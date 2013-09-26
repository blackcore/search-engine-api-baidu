/**
 * 
 * SEAPIBaidu
 * sob.baidu.core.JacksonUtil.java
 */
package sob.baidu.core;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.JavaType;

/**
 * @author blackcore
 * @date 2013-9-25 ÏÂÎç3:37:50
 * 
 */
public abstract class JacksonUtil {
	private static final ObjectMapper mapper;

	public JacksonUtil() {
	}

	static {
		mapper = new ObjectMapper();
		mapper.configure(org.codehaus.jackson.map.SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS, false);
	}

	public static final String obj2Str(Object o) throws JsonGenerationException, JsonMappingException, IOException {
		return mapper.writeValueAsString(o);
	}

	public static final void writeObj(OutputStream out, Object value) throws JsonGenerationException, JsonMappingException, IOException {
		mapper.writeValue(out, value);
	}

	public static final Object str2Obj(String s, Class<?> valueType) throws JsonParseException, JsonMappingException, IOException {
		return mapper.readValue(s, valueType);
	}

	public static final Object readObj(InputStream in, Class<?> valueType) throws JsonParseException, JsonMappingException, IOException {
		return mapper.readValue(in, valueType);
	}

	public static final Object readObj(InputStream in, JavaType valueType) throws JsonParseException, JsonMappingException, IOException {
		return mapper.readValue(in, valueType);
	}

}
