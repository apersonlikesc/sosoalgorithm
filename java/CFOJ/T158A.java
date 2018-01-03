package sosoalgorithm.java.CFOJ;

import java.util.Scanner;

public class T158A {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()) {
			int count = 0;
			int length = sin.nextInt();
			int[] a = new int[length];
			int strand = sin.nextInt();
			for(int i = 0;i<length;i++) {
				a[i] = sin.nextInt();
			}
			strand = a[strand-1];
			for(int i = 0;i<length;i++) {
				if(a[i]>=strand && a[i] != 0) {
					count = count+1;
				}
			}
			
			System.out.println(count);
		}
		sin.close();
	}
}
