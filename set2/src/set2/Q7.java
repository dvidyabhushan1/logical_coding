package set2;

import java.util.Arrays;

public class Q7 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 5, 35, 40, 500};
		//                 0   1   2    3    4  5   6   7
		System.out.println("intial"+ Arrays.toString(elements));
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < elements.length; i++) {
			sum += elements[i];
		}
		 avg = sum / elements.length;
		elements[(elements.length) / 2] = avg;
		System.out.println("final"+ Arrays.toString(elements));
		
	}
}
