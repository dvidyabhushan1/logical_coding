package set2;

import java.util.Arrays;

public class Q25 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 5, 35, 40, 500};
		//                 0   1   2    3    4  5   6   7    8
		System.out.println("intial:   "+ Arrays.toString(elements));
		int temp = elements[elements.length - 1];
		for (int i = elements.length - 1; i > 0; i --) {
			elements[i] = elements[i - 1];
		}
		elements[0] = temp;
		System.out.println("final:    "+ Arrays.toString(elements));
		
	}
}
