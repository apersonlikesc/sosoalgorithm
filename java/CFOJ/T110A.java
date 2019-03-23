
import java.util.Scanner;

public class T110A {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()) {
			String s = sin.next();
			int count = 0;
			for(int i = 0 ;i<s.length();i++) {
				if(s.substring(i, i+1).matches("((4|7)*?)")) {
					count = count + 1;
				}
			}
			if(String.valueOf(count).matches("((4|7)*?)")) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
			
		}
		sin.close();
	}
}
