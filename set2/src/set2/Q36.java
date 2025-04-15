package set2;

import java.util.Arrays;

public class Q36 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 20, 35, 40, 500};
		//                 0   1   2    3    4  5   6   7    8
		System.out.println("intial:  "+ Arrays.toString(elements));
		int element = 20;
		int total = 0;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == element) {
				rightShift(elements, i);
				total ++;
			}
		}
		int[] temp = elements;
		elements = new int[temp.length - total];
		for (int i = 0; i < elements.length; i++) {
			elements[i] = temp[i + total];
		}
		System.out.println("final:   "+ Arrays.toString(elements));
	}

	private static void rightShift(int[] elements, int index) {
		for (int i = index; i > 0; i--) {
			elements[i] = elements[i - 1];
		}
		
	}
}

// gorupforce(loopforce) aproch plz ignore this method