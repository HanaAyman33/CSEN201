public class MergeRec {
	public static void main(String[] args) {
		int[] a = {1,3,5};
		int[] b = {2,4,6,7,8};
		int i1 = 0,i2 = 0;
		System.out.println(MergeRec(a,b,i1,i2));
	}
	public static String MergeRec(int[] a,int[] b,int i1,int i2) {
		if(i1==a.length && i2==b.length)
			return "";
		if(i1==a.length && i1<=i2)
			return b[i2]+" " + MergeRec(a,b,i1,++i2);
		if(i2==b.length && i2<=i1)
			return a[i1]+" "+ MergeRec(a,b,++i1,i2);
		return a[i1]+" "+b[i2]+" "+ MergeRec(a,b,++i1,++i2);
	} 
}
