package sosoalgorithm.java.CFOJ;

import java.util.Scanner;

public class T69A {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()) {
			int suma=0,sumb=0,sumc = 0;
			int number= sin.nextInt();
			for(int i = 0;i<number;i++) {
				int a = sin.nextInt();
				int b = sin.nextInt();
				int c = sin.nextInt();
				suma = suma + a;
				sumb = sumb + b;
				sumc = sumc + c;

			}
			if(suma == 0&&sumb == 0&&sumc == 0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		sin.close();
	}
}
