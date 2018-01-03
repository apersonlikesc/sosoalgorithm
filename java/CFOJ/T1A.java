package sosoalgorithm.java.CFOJ;

import java.math.BigInteger;
import java.util.Scanner;

public class T1A {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()) {
			int n = sin.nextInt();
			int m = sin.nextInt();
			int a = sin.nextInt();
			int length = n/a;
			int width = m/a;
			if(n%a>0) {
				length = length+1;
			}
			if(m%a > 0){
				width = width + 1;
			}
			BigInteger q = new BigInteger(String.valueOf(length));
			q = q.multiply(new BigInteger(String.valueOf(width)));
			System.out.println(q);
		}
		sin.close();
		
	}
}
