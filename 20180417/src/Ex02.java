
public class Ex02 {
	
	
	public static boolean isNumber(String str) {
		if(str.equals(null) || str.equals(""))
			return false;
		for(int i=0; i<str.length(); i++) {
			int substr = str.charAt(i);
			if(substr < 48 || substr > 57 )
				return false;
		}
		return true;
	}
	/*
	 * public static boolean isNumber(String str){
	 * 		if(str.equals(null) || str.equals("")){
	 * 			return false;
	 * 		}
	 * 
	 * 		for(int i=0; i<str.length(); i++)
	 * 		{
	 * 			char substr = str.charAt(i);
	 * 			if(substr<'0' || substr >'9')
	 * 				return false;
	 * 		}
	 * 		return true;
	 * 
	 * 		
	 * }
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		String str = "kk23666";
		System.out.println(isNumber(str));
	}
}
