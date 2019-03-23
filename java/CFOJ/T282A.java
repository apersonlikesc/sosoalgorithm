import java.util.Scanner;

public class T282A {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()) {
			int number = sin.nextInt();
			int a = 0;
			String[] s = new String[number];
			for(int i=0;i<number;i++) {
				s[i] = sin.next();
				if(s[i].contains("+")) {
					a = a+1;
				}else if(s[i].contains("-")) {
					a = a - 1;;
				}
			}
			
			System.out.println(a);
			
			
		}
		sin.close();
	}
}
