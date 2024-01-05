public class AbsDifference {
	public static void main(String[] args) {
		double[] a = {8.2,3.5,6.0,3.5,20.0};
		System.out.println(AbsDiff(a));
	}
	public static double AbsDiff(double[] a) {
		double diff ;
		double smallest = 100;
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a.length && i!=j;j++) {
				diff = Math.abs(a[i]-a[j]);
				if(diff<smallest)
					smallest = diff;
			}
		}
		return smallest;
	}
}
