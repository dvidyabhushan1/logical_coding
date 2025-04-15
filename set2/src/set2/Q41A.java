package set2;

import java.util.Arrays;

public class Q41A {
	public static void main(String[] args) {
		int[] elements = {6, 4, 8, 7};
		System.out.println("initial: " + Arrays.toString(elements));
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0; 
		int naturalSum = 0;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] < min) {
				min = elements[i];
			}
			if (elements[i] > max) {
				max = elements[i];
			}
			sum += elements[i];
		}
	
		for (int i = min ; i <= max; i++) {
			naturalSum += i;
		}
		int missedElement = naturalSum - sum;
		System.out.println("missedElement =  " + missedElement);
		
	}
}
