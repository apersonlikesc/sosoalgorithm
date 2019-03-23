
import java.util.Scanner;

public class T118A {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()) {
			String s = sin.next();
			s =s.toLowerCase();
			s=s.replaceAll("[aeiouy]", "");
			String a="";
			for(int i = 0;i<s.length();i++) {
					a = a+"."+s.substring(i, i+1);
			}
			System.out.println(a);
		}
		
		sin.close();
	}
}
