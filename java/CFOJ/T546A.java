
import java.util.Scanner;

public class T546A {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()) {
			int k = sin.nextInt();
			int n = sin.nextInt();
			int w = sin.nextInt();
			int sum = 0;
			for(int i = 0;i<w;i++) {
				sum = sum + (i+1)*k;
			}
			if(sum>n) {
				System.out.println(sum - n);
			}else {
				System.out.println(0);
			}
		}
		sin.close();
	}
}
