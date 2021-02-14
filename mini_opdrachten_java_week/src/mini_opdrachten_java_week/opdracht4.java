package mini_opdrachten_java_week;

import java.util.Arrays;

public class opdracht4 {
	
	public final static void main(String args[]) {
		
		int[] willekeurige_getallen = {11, 2, 26, 3, 39, 5, 17, 9, 4, 10};
		
		System.out.println(Arrays.toString(willekeurige_getallen));
		
		sorteren(willekeurige_getallen);
		
	    System.out.println(Arrays.toString(willekeurige_getallen));
	}
	
	public static void sorteren(int[] een_array) {
		// Selection sort, prima voor 10 elementen in een array
		for (int i = 0; i < een_array.length - 1; i++) {
			
			int kleinste_getal = een_array[i];
			int ruil_positie = i;
			
			for (int j = i + 1; j < een_array.length; j++) {
				if (een_array[j] <= kleinste_getal) {
					kleinste_getal = een_array[j];
					ruil_positie = j;
				}
			}
			int temp = een_array[i];
			een_array[i] = kleinste_getal;
			een_array[ruil_positie] = temp;
		}
	}
}
