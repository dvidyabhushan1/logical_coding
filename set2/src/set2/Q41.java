package set2;

import java.util.Arrays;

public class Q41 {
	public static void main(String[] args) {
		int[] elements = {6, 4, 8, 7};
		System.out.println("initial: " + Arrays.toString(elements));
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0; 
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] < min) {
				min = elements[i];
			}
			if (elements[i] > max) {
				max = elements[i];
			}
			sum += elements[i];
		}
		int n = max - min + 1;
		int naturalSum = (n * (2 * min + (n - 1))) / 2;
		int missedElement = naturalSum - sum;
		System.out.println("missedElement=  " + missedElement);
		
		int sum1 = 0;
		for (int i = min ; i <= max; i++) {
			 sum1 += i;
		}
		System.out.println(sum1);
	}
}
