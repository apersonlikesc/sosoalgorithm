package lintcode;

import java.util.Scanner;

public class T1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = Math.addExact(a, b);
		System.out.println(c);
		
		
		in.close();
	}
}
