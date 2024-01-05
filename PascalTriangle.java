public class PascalTriangle {
	public static void main(String[] args) {
		int[] a= {1};
		int n = 6;
		printPascal(a,n);
		
	}
	public static void printPascal(int[] a,int n){
		int[][] x = new int[n][n];
		for(int i= 0;i<n;i++) {
			for(int j = 0;j<=i;j++) {
				if(j==0 || j==i)
					x[i][j] = 1;
				else
					x[i][j] = x[i-1][j] + x[i-1][j-1];
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
}
