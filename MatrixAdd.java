public class MatrixAdd {
	public static void main(String[] args) {
		int[][] a = {{4,5,6},{4,5,6},{4,5,6}};
		int[][] b = {{1,2,3},{1,2,3},{1,2,3}};
		int[][] c = {{5,7,9},{5,7,9},{5,7,9}};
		int[][] output = addElements(a,b);
		System.out.println(compare(c,output));
	}
	public static int[][] addElements(int[][] a,int[][] b) {
		int sum = 0;
		int[][] output = new int[a.length][b.length];
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<b.length;j++) {
				sum = a[i][j] + b[i][j];
				output[i][j] = sum;
			}
		}
		return output;
	}
	public static boolean compare(int[][] c,int output[][]) {
		for(int i = 0;i<c.length;i++) {
			for(int j = 0;j<output.length;j++) {
				if(output[i][j]!=c[i][j])
					return false;
			}
		}
		return true;
	}
}
