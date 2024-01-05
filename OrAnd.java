public class OrAnd {
	public static void main(String[] args) {
		boolean[][] b = {{true,false,true,true},{false,false,true,true},{true,true}};
		System.out.println(evaluate(b));
	}
	public static boolean evaluate(boolean[][] b) {
		boolean result = false;
		for(int i = 0;i<b.length;i++) {
			boolean row = true;
			for(int j = 0;j<b[i].length;j++)
				row = row && b[i][j];
			result= row || result;
		}
		return result;
	}
}
