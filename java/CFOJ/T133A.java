
import java.util.Scanner;

public class T133A {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()) {
			String s = sin.next();
			boolean status = false;
			for(int i = 0;i<s.length();i++) {
				String s1 = s.substring(i, i+1);
				if(s1.matches("[HQ9]")) {
					status = true;
				}
			}
			if(status) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		sin.close();
	}
}
