public class DectoBin {
	public static void main(String[] args) {
		String a = args[0];
		int n = Integer.parseInt(args[0]);
		if(isDigit(a)) {
			String output = "";
			for(;n!=0;n/=2) {
				int temp = n%2;
				output =temp+""+output;
			}
			System.out.println(output);
			}
	}
	public static boolean isDigit(String a) {//Problem Here
		for(int i = 0;i<a.length();i++) {
			if(a.charAt(i)>0 && a.charAt(i)<10)//and Here
				return false;
		}
		return true;
	}
}
