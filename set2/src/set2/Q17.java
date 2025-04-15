package set2;

import java.util.Arrays;

public class Q17 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 5, 35, 40, 500};
		//                 0   1   2    3    4  5   6   7    8
		System.out.println("intial"+ Arrays.toString(elements));
		for (int i = 1; i < elements.length / 2; i++) {
			
			elements[i] = elements[i] + elements[(elements.length - 1) - i];
			elements[(elements.length - 1) - i] = elements[i] - elements[(elements.length - 1) - i];
			elements[i] = elements[i] - elements[(elements.length - 1) - i];
		}
		System.out.println("final"+ Arrays.toString(elements));
		
	}
}
