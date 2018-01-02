package sosoalgorithm.HDOJ;
/*
 * f(1) = 1, f(2) = 1, f(n) = (A * f(n - 1) + B * f(n - 2)) mod 7.
 * 1 1 3
1 2 10
0 0 0
 */
import java.util.Scanner;

public class T1005 {
	
	public static void main(String[] args) {
	Scanner sin = new Scanner(System.in);
	
	while(sin.hasNext()) {
		int A = sin.nextInt();
		int B = sin.nextInt();
		int N = sin.nextInt();
		N = N%49;
		int number1 = 1;
		int number2 = 1;
		int status = 0;
		if(N==1||N==2) {
			status = 1;
		}else if(N == 0&&A==0&&B==0) {
			System.exit(1);
		}else {
			for(int i = 2;i<N;i++) {
				if(i%2 == 0) {
					number1 = (A * number2 + B * number1)%7;
					status = 1;
				}else {
					number2 = (A * number1 +B * number2)%7;
					status = 2;
				}
			}
		}
			
		if(status == 1) {
			System.out.println(number1);
		}else {
			System.out.println(number2);
		}
	}
	sin.close();
}
}
