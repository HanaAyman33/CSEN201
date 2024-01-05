import java.util.*;
public class SplitArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pivot: ");
		int pivot = sc.nextInt();
		int[] a = {13,-42,8,35,-7,46,28,-19};	
		split(a,pivot,a.length);
	}
	public static void split(int a[], int pivot,int size) {
		int i = 0,j = a.length-1;
		while(i<=j) {
			if(a[i]>pivot && a[j]<=pivot) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			else if(a[i]>pivot)
				j--;
			else if(a[j]<=pivot)
				i++;
			else {
				i++;
				j--;
			}
		}
		for(int k = 0;k<a.length;k++) {
			System.out.print(a[k]+" ");
		}
	}
}
