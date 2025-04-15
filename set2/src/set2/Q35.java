package set2;

import java.util.Arrays;

public class Q35 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 5, 35, 40, 500};
		//                 0   1   2    3    4  5   6   7    8
		System.out.println("intial:  "+ Arrays.toString(elements));
		int index = 3;
		int newElement = 8000;
		elements[index] = newElement;
//		elements[0] = 10101;
		System.out.println("final:   "+ Arrays.toString(elements));
		
	}
}
