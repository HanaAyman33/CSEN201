public class Problem2 {
	public static void main(String[] args) {
		int[][] a = {{1,3,5,9},{2,100},{2,2,3}};
		int max = -1;
		for(int i = 0;i<a.length;i++) {
			int  sum = 0;
			int maxIndex = 0;
			for(int j = 0;j<a[i].length;j++) {
				sum+=a[i][j];
			}
			if(sum>max) {
				max = sum;
				maxIndex= i;
			}
			int[] temp = a[0];
			a[0] = a[maxIndex];
			a[maxIndex] = temp;
		}
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}
	}
}
