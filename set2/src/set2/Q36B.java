package set2;


import java.util.Arrays;

public class Q36B {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 20, 35, 40, 500};
		//                 0   1   2    3    4  5   6   7    8
		System.out.println("intial:  "+ Arrays.toString(elements));
		int element = 120;
		int total = 0;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == element) {
				total++;
			}
		}
		int[] temp = elements;
		elements = new int[temp.length - total];
		for (int i = 0, j = 0; i < temp.length; i++) {
			if(temp[i] != element) {
				elements[j] = temp[i];
				 j++;
			}
		}
		System.out.println("final:   "+ Arrays.toString(elements));
	}
}
