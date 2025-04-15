package set2;

import java.util.Arrays;

public class Q24 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 5, 35, 40, 500};
		//                 0   1   2    3    4  5   6   7    8
		System.out.println("intial"+ Arrays.toString(elements));
		for (int i = 0; i < elements.length - 3; i++) {
			elements[i] = elements[i + 3];
		}
		System.out.println("final"+ Arrays.toString(elements));
		
	}
}
