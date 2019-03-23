
import java.util.Scanner;

public class T339A {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()) {
			String s1 = sin.next();
			String s2 = "";
			int[] a = new int[4];
			for(int i = 0;i<s1.length();i=i+2) {
				int b = Integer.valueOf(s1.substring(i, i+1));
				a[b] = a[b]+1;
			}
			for(int i = 1;i<4;i++) {
				for(int j = 0;j<a[i];j++) {
					s2 = s2 + i + "+";
				}
			}
			s2 = s2.substring(0, s1.length());
			System.out.println(s2);
		}
		sin.close();
	}
}
