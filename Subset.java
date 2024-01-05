public class Subset {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {2,4,5,1};
		System.out.println(subset(a,b));
	}
	public static boolean subset(int[] a,int[] b) {
		boolean flag = false; 
		for(int i = 0;i<a.length;i++) {
			if(a.length==0) {
				flag = true;
				break;
			}
			else {	
			for(int j= 0;j<b.length;j++) {
				if(a[i]==b[j]) {
					flag = true;
					break;
				}
				else
					flag = false;
			 }
		  }
	   }
		return flag;
	}
}
