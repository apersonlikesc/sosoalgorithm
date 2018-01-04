package sosoalgorithm.java.CFOJ;

import java.util.Scanner;

public class T266A {
	public static void main(String[] args) {
		Scanner sin =new Scanner(System.in);
		while(sin.hasNext()) {
			int number = sin.nextInt();
			int count = 0;
			String color = sin.next();
			String a = color.substring(0, 1);
			for(int i = 1;i<number;i++) {
				if(a.equals(color.substring(i,i+1))) {
					count = count + 1;
				}else {
					a = color.substring(i,i+1);
				}
			}
			System.out.println(count);
		}
		sin.close();
	}
}
