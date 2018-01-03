package sosoalgorithm.java.CFOJ;

import java.util.Scanner;

public class T96A {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()) {
			int a = 0;
			int b = 0;
			boolean status = false;
			String s = sin.next();
			for(int i = 0;i<s.length();i++) {
				if(s.substring(i, i+1).contains("0")) {
					b = 0;
					a = a +1;
				}else {
					a = 0;
					b = b +1;
				}
			if(a>6||b>6) {
				status = true;
			}
			}
			if(status == true) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		}
		sin.close();
	}
}