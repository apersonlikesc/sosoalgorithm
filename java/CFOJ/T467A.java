package sosoalgorithm.java.CFOJ;

import java.util.Scanner;

public class T467A {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		int count = 0;
		while(sin.hasNext()) {
			int number = sin.nextInt();
			for(int i = 0;i<number;i++) {
				int a = sin.nextInt();
				int b = sin.nextInt();
				if(b - a >1) {
					count = count + 1;
				}
			}
			System.out.println(count);
			
		}
		sin.close();
	}
}
