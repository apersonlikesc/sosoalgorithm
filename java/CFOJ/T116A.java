package sosoalgorithm.java.CFOJ;

import java.util.Scanner;

public class T116A {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()) {
			int number = sin.nextInt();
			int a = 0;
			int max = 0;
			for(int i = 0;i<number * 2;i++) {
				if(i%2 ==0) {
					a = a - sin.nextInt();
				}else {
					a = a + sin.nextInt();
					if(a>max) {
						max = a;
					}
				}
				
			}
			System.out.println(max);
			
			
		}
		sin.close();
	}
}
