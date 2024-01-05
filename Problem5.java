
public class Problem5 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		int n = 4;
		System.out.println(BinSearch(a,n,a.length/2));
	}
	public static int BinSearch(int[] a,int n,int i) {
		if(a[i]==n)
			return i;
		if(a[i]<n)
			i++;
		if(a[i]>n)
			i--;
		return BinSearch(a,n,i);
	}
}
