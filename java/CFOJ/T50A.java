package sosoalgorithm.java.CFOJ;

import java.util.Scanner;

public class T50A {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()) {
			int length = sin.nextInt();
			int width = sin.nextInt();
			int a = length/2;
			int b = length%2 == 0?0:width/2;
			int sum = (a * width + b);
			System.out.println(sum);
		}
		sin.close();
	}
}
