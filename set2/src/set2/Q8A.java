package set2;

import java.util.Arrays;

public class Q8A {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 5, 35, 40, 500};
		//                 0   1   2    3    4  5   6   7    8
		System.out.println("intial"+ Arrays.toString(elements));
		elements[0] = elements[0] + elements[elements.length - 1];
		elements[elements.length - 1] = elements[0] - elements[elements.length - 1];
		elements[0] = elements[0] - elements[elements.length - 1];
		System.out.println("final"+ Arrays.toString(elements));
		
	}
}
