package set1;

public class Q36 {
	public static void main(String[] args) {
		int [] elements = {57, 20, 30, 44, 50, 27, 70, 88, 777};
 					 	//  0   1   2   3   4    5   6   7    8
					   // length = 8;
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] < min1) {
				min2 = min1;
				min1 = elements[i];
			}
			else if(elements[i] < min2 && elements[i] > min1) {
				min2 = elements[i];
			}
		}
//		System.out.println(min1);
		if (min2 != Integer.MAX_VALUE) {
			System.out.println(min2);	
		}
		System.out.println("done");
	}
}
