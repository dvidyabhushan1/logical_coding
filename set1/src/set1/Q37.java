package set1;

public class Q37 {
	public static void main(String[] args) {
		int [] elements = {57, 20, 30, 44, 50, 27, 797, 888, 777};
 					 	 // 0   1   2   3   4    5   6   7   8
					    // length = 9;
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] > max1) {
				max2 = max1;
				max1 = elements[i];
			}
			else if (elements[i] > max2 && elements[i] < max1 ) {
				 max2 = elements[i];
			}
		}
			System.out.println(max2);
	}
}
