
public class Pattern {
	public static void main(String[] aths) {
		int[][] a = {{1},{2,2},{3,3,3},{4,4,3,4}};
		System.out.println(isPattern(a));
		
	}
	public static boolean  isPattern(int[][] a) {
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				if(a[i][j]!=a[i].length)
					return false;
			}
		}
		return true;
	}
}
