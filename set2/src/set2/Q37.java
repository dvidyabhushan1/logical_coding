package set2;

import java.util.Arrays;

public class Q37 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 20, 35, 40, 500};
		//                 0   1   2    3    4  5   6   7    8
		System.out.println("intial:  "+ Arrays.toString(elements));
		int index1 = 2, index2= 6;
		int total = index2 - index1;
		
		for (int i = index2; i < elements.length; i++) {
			elements[i - total] = elements[i];
			}
		int[] temp = elements;
		elements = new int[temp.length - total];
		for (int i = 0; i < temp.length - total; i++) {
				elements[i] = temp[i];
		}
		System.out.println("final:   "+ Arrays.toString(elements));
	}
}
