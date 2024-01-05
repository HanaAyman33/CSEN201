
public class Palindrome {
	public static void main(String[] args) {
		char[] a = {'n','o','o','n'};
		int i = 0,j = a.length-1;
		boolean flag = false;
		while(i<a.length) {
			if(a[i]==a[j])
				flag = true;
			else
				flag = false;
		i++;
		j--;
		}
		System.out.println(flag);
	}
}
