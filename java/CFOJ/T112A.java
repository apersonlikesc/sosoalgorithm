package sosoalgorithm.java.CFOJ;

import java.util.Scanner;

public class T112A {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()) {
			String s1 = sin.next();
			String s2 = sin.next();
			int a = s1.compareToIgnoreCase(s2);
			if(a<0) {
				System.out.println(-1);
			}else if(a ==0) {
				System.out.println(0);
			}else {
				System.out.println(1);
			}
			
			
		}
		sin.close();
	}
}
