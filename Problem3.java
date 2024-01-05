public class Problem3 {
	public static void main(String[] args) {
	int[] a = {4,7,3,2,9,12,-47,-19,308,3,74};
	int n = 4;
	System.out.println(isUnique(a,n));
	
	}
	public static boolean isUnique(int[] a,int n) {
		return helper(a,n,0,0,false);
	}
	public static boolean helper(int[] a,int n,int i,int count,boolean flag) {
		if(i==a.length)
			return flag;
		if(a[i]==n)
			return helper(a,n,++i,++count,flag);
		if(count!=1)
			flag = false;
		else
			flag = true;
		return helper(a,n,++i,count,flag);
	}
}
