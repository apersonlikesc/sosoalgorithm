package sosoalgorithm.java.CFOJ;

import java.util.Scanner;

public class T231A {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()) {
			int number = sin.nextInt();
			int count = 0;
			int a = 0;
			int sum;
			for(int j = 0;j<number;j++) {
				sum = 0;
				for(int i = 0;i<3;i++) {
					a = sin.nextInt();
					sum = a + sum;
				}
				if(sum>1) {
					count = count + 1;
				}
			}
			
			System.out.println(count);
			
		}
		sin.close();
	}
}
