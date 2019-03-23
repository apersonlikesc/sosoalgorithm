
import java.util.Scanner;

public class T281A {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()) {
			String s = sin.next();
			s = s.substring(0, 1).toUpperCase()+s.substring(1);
			System.out.println(s);
		}
		sin.close();
	}
}
