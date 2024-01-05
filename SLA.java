import java.util.*;
public class SLA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in your list: ");
		int n = sc.nextInt();
		int[] A = new int[n];
		for(int i = 0;i<n;i++) {
			int a = sc.nextInt();
			A[i] = a;
		}
		int smallest = 100;
		int largest = -1;
		int l = 0;
		int s = 0;
		for(int i = 0;i<A.length;i++) {
			if(A[i]>largest) {
				largest = A[i];
				l = i;
			}
			if(A[i]<smallest) {
				smallest = A[i];
				s = i;
			}	
		}
		System.out.println("Smallest: "+smallest+" & in index "+s);
		System.out.println("Largest: "+largest+" & in index "+l);
		
		int sum = 0;
		for(int i = 0;i<A.length;i++) {
			sum+=A[i];
		}
		System.out.println("Arihmetic mean is: "+sum/A.length);
	}
}
