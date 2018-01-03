package sosoalgorithm.CF;

import java.util.Scanner;

public class T71A {
	public static void main(String[] args) {
	Scanner sin = new Scanner(System.in);
	while(sin.hasNext()) {
		int number = sin.nextInt();
		String a[] = new String[number];
		for(int i = 0;i<number ;i++) {
			a[i] = sin.next();
		}
		for(int i = 0;i<number;i++) {
			if(a[i].length() <11)
				System.out.println(a[i]);
			else
			System.out.println(a[i].substring(0, 1)+(a[i].length()-2)+a[i].substring(a[i].length()-1));
		}
	}
	sin.close();
}
}
