import java.util.*;
public class Divisors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxD = 1;
		int num= 1;
		for(int i = 2;i<=10000;i++) {
			int count = 0;
			for(int j = 1;j<=i;j++) {
				if(i%j==0)
					count++;
			}
			if(count>maxD)
				num =i;
		}
		System.out.println("the number is "+ num+ " with "+maxD+" divisors");
	}
}
