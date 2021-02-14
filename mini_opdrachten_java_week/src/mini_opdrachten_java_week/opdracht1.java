package mini_opdrachten_java_week;

public class opdracht1 {
	
	public final static void main(String args[]) {
		
	    String result1 = stringconcat("dop","erwt","en");
	    String result2 = stringconcat("po","ging","en");

	    System.out.println(result1);     
	    System.out.println(result2);  
	}
	
	public static String stringconcat(String str1, String str2, String str3) {
		return str1 + str2 + str3;
	}
}
