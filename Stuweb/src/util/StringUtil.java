package util;
/**
 * 
 * @author xujinfengxu
 * String method
 */
public class StringUtil {
	public static boolean isEmpty(String str) {
		if(str == null || "".equals(str))  return true;
		return false;
	}
}
