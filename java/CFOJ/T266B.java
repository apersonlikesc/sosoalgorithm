
import java.util.Scanner;

public class T266B {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()) {
			int length = sin.nextInt();
			int time = sin.nextInt();
			String s = sin.next();
			String a = "";
			for(int i = 0;i<time;i++) {
				a ="";
				for(int j = 0;j<length-1;j++) {
					if(s.charAt(j)=='B'&&s.charAt(j+1) == 'G') {
						a = a + "GB";
						j= j+1;
						continue;
					}
					a = a + s.substring(j, j+1);
				}
				if(a.length()!=s.length()) {
					a = a + s.substring(length-1);
				}
				s = a;
			}
			System.out.println(s);
		}
		sin.close();
	}
}
