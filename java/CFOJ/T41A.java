import java.util.Scanner;

public class T41A {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		
		while(sin.hasNext()) {
			boolean b = true;
			String s = sin.next();
			String rs = sin.next();
			if(s.length()!=rs.length()) {
				System.out.println("NO");
				continue;
			}
			int length=s.length();
			int a = length;
			for(int i = 0;i<length;i++) {
				if(!s.substring(i, i+1).equals(rs.substring(a-(i+1), a-i))) {
					System.out.println("NO");
					b = false;
					break;
				}
			}
			if(b == true) {
				System.out.println("YES");
			}
		}
		sin.close();
	}
}
