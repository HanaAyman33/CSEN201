import java.util.*;
public class ArrayExpand {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] a = {21,8,15,0,-3,32};
		printArray(expand(a,3));
	}
	public static int[] expand(int[] a,int n) {
		int[] out = new int[a.length*n];
		if(n==0)
			return out;
		if(n==1)
			return a;
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<n;j++) {
				out[i*n+j] = a[i]/n;
			}
	    }
		return out;
	}
	public static void printArray(int a[]) {
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
}
