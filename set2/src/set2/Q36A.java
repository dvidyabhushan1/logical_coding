package set2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q36A {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 120, 578, 20, 35, 40, 500};
		//                 0   1   2    3    4  5   6   7    8
		System.out.println("intial:  "+ Arrays.toString(elements));
		int element = 20;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] != element) {
				list.add(elements[i]);
			}
		}
		elements = new int[list.size()];
		for (int i = 0; i < elements.length; i++) {
			elements[i] = list.get(i);
		}
		System.out.println("final:   "+ Arrays.toString(elements));
	}
}

