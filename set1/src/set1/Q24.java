package set1;

public class Q24 {
	public static void main(String[] args) {
		int [] elements = {57, 20, 30, 44, 50, 27, 70, 88, 777};
 					 	//  0   1   2   3   4    5   6   7    8
					   // length = 8;
		for (int i = 1; i < elements.length; i += 2) {
				System.out.print(elements[i] + ", ");	
		}
		System.out.println();
		System.out.println("done");
	}
}
