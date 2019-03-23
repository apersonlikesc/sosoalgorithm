
import java.util.Scanner;

public class T58A {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()) {
			String s = sin.next();
			if(s.matches("(.*?)(h)(.*?)(e)(.*?)(l)(.*?)(l)(.*?)(o)(.*?)")) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		sin.close();
	}
}
