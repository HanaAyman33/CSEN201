import java.util.*;
public class Problem4 {
	public static void main(String[] args) {
		int[] a = {21,8,15,0,-3,32};
		int n = 3;
		System.out.println(expand(a,n));
		
	}
	public static int[] expand(int[] a,int n) {
		int[] result = new int[a.length*n];
		if(n==1)
			return a;
		if(n==0)
			return new int[0];
		for(int i = 0;i<a.length;i++) {
			for(int j = i*n;j<result.length;j++) {
				result[j] = a[i]/n;
			}
		}
		return result;
	}
}
