import java.util.Scanner;
public class Compress {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string: ");
	String s = sc.nextLine();
	String output = "";
	String digits = "";
	for(int i = 0;i<s.length();i++) {
		char c = s.charAt(i);
		if(c<='9' && c>='1')
			digits+=c;
		else {
			for(int j = 0;j<Integer.parseInt(digits);j++) {
				output+=c;
			}
			digits = "";
		}	
	}
	System.out.println(output);
	}
}
//Another Solution;)
/*import java.util.*;
class HelloWorld {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter string: ");
	String s = sc.nextLine();
	int digits = 0;
	int i = 0;
	String out = "";
	String temp = "";
	while(i<s.length()){
    	while(s.charAt(i)>='0' && s.charAt(i)<='9'){
       	temp+=s.charAt(i);
       	i++
    	}
    	digits = Integer.parseInt(temp);
    	for(int j = 0;j<digits;j++)
       	out+=s.charAt(i);
    	temp = "";
    	digits = 0;
    	i++;
	}
	System.out.println("Input: "+ s);
	System.out.println("Output: "+ out);
 	}
}
*/

