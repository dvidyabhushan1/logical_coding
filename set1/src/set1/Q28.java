package set1;

public class Q28 {
	public static void main(String[] args) {
		int [] elements = {57, 20, 30, 44, 50, 27, 70, 88, 777};
 					 	//  0   1   2   3   4    5   6   7    8
					   // length = 8;
		int sum = 0;
		for (int i = 0; i < elements.length ; i++) {
				sum += elements[i];
		}
		System.out.println("sum of array = " + sum);
		System.out.println("done");
	}
}
