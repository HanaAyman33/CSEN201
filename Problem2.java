
public class Problem2 {
	public static void main(String[] args) {
		int[] a = {4,5,6,7,8};
		int[] b = {2,3,4,8,10,16};
		System.out.println(commonElements(a,b));
	}
	public static String commonElements(int[] a,int[] b) {
		return commonElementsHelper(a,b,0,0);
	}
	public static String commonElementsHelper(int[] a,int[] b,int i1,int i2) {
		if(i1==a.length)
			return"";
		if(a[i1]==b[i2])
			return a[i1]+" "+commonElementsHelper(a,b,++i1,i2);
		if(i2==b.length-1 && a[i1]!=b[i2])
			return commonElementsHelper(a,b,++i1,0);
		return commonElementsHelper(a,b,i1,++i2);
	}
}
