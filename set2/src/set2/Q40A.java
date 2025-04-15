package set2;

import java.util.Arrays;

public class Q40A {
	public static void main(String[] args) {
		int[] elements = {10, 20, 10, 20, 578, 20, 35, 40, 500, 40};
		//                 1   2   3   4    5   6   7   8    9
		System.out.println("initial: " + Arrays.toString(elements));
		Arrays.sort(elements);
		System.out.println("after sorting" + Arrays.toString(elements));
		int j = 0;
		for(int i = 1; i < elements.length; i++) {
			if(elements[j] != elements[i]) {
				j++;
				elements[j] = elements[i];
			}
		}
		int[] temp = elements;
		elements = new int[j + 1];
		for (int i = 0; i < elements.length; i++) {
				elements[i] = temp[i];
		}
		System.out.println("final: " + Arrays.toString(elements));
	}	
}
