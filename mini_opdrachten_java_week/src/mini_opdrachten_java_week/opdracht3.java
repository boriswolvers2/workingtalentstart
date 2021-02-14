package mini_opdrachten_java_week;

public class opdracht3 {
	
	public final static void main(String args[]) {
		
		int[] willekeurige_array1 = {1, 2, 3, 4};
		int[] willekeurige_array2 = {5, 16, 11, 19, 2};
		
		int som1 = optellen(willekeurige_array1);
		int som2 = optellen(willekeurige_array2);
		
	    System.out.println(som1);
	    System.out.println(som2);   
	}
	
	public static int optellen(int[] een_array) {
		
		int som = 0;
		
		for (int i = 0; i < een_array.length; i++) {
			som += een_array[i];
		}
		return som;
	}
}
