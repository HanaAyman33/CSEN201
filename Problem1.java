import java.util.*;
public class Problem1 {
	public static void main(String[] args) {
		int[] a = {2,7,4,-5,11,5,20};
		int n = 15;
		for(int i = 0;i<a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[i]+a[j]==n)
					System.out.println("Pair of elements and their sum: \n"+
										a[i]+" + "+a[j]+" = "+n);
			}
		}
	}
}
