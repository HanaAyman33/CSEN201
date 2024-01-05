public class Shuffle {
	public static void main(String[] args){
		String[] words = {"CSEN","202","Spring","2019"};
		printArray(shuffle(words));
	}
	public static String[] shuffle(String[] w) {
		String[] out = new String[w.length];
		int i = (int)(Math.random()*(w.length));
		int j = 0;
		while(j<w.length) {
			if(out[i]==null) {
				out[i] = w[j];
				j++;
			}
		}
		return out;
	}
	public static void printArray(String[] a) {
		for(int k = 0;k<a.length;k++) {
			System.out.print(a[k]+" ");
		}
	}
}
