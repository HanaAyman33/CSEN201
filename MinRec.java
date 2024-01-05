public class MinRec {
	public static void main(String[] args) {
		int[] a = {5,2};
		int i = 0;
		int min = 100;
		System.out.println(MinRec(a,i,min));
	}
	public static int MinRec(int[] a,int i,int min) {
		if(i==a.length)
			return min;
		else {
			if(a[i]<min)
				min = a[i];
		return MinRec(a,++i,min);
		}
	}
}
