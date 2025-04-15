package set2;

import java.util.Arrays;

public class Q32 {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 5, 35, 40, 500};
		//                 0   1   2    3    4  5   6   7    8
		System.out.println("intial:   "+ Arrays.toString(elements));
		int mid = elements.length / 2;
		int temp = elements[mid];
			for (int i = mid; i < elements.length -1; i++){
			elements[i] = elements[i + 1];
		}
		elements[elements.length - 1] = temp;
		System.out.println("final:   "+ Arrays.toString(elements));
		
	}
}
