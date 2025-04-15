package set1;

public class Q4 {
	public static void main(String[] args) {
		int [] elements = {10,  20, 30, 40, 50, 100, 70, 88};
						// 0    1    2   3   4    5   6   7 
						// length = 8;
		   int length = elements.length;
		int ans1 = elements[(length / 2) - 1];
		int ans2 = elements[(length / 2)];
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.print(elements[(elements.length / 2) - 1] + ", ");
		System.out.print(elements[(elements.length / 2)] + ", ");
	}
}

/* 
  if total numbers of middle elements is even there will be two middle 
     1-(elments.length)/2
     2-((elments.length)/2) - 1      
 */

