package p3;

public class StringUtil {

	public static String concatenate(String[] strArr) {
		String result = "";
		for(int i = 0 ; i < strArr.length; i++) {
			result += strArr[i];
		}
		return result;
	}
}
