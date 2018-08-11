package sosoalgorithm.java.CFOJ;

import java.util.Scanner;

public class T271A {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()) {
			
			int a = sin.nextInt();
			int[] ar = new int[4];
			for(int i = a+1;;i++) {
				boolean chongfu = false;
				String s = String.valueOf(i);
				for(int b = 0;b<4;b++) {
					Integer number = Integer.valueOf(s.substring(b, b+1));
					ar[b] = number;
				}
					for(int c = 0;c<4;c++) {
										for(int q = c+1;q<4;q++) {
											if(ar[c] == ar[q]) {
												chongfu = true;
											}
											if(chongfu == true) {
												break;
											}
											}
						if(chongfu == true) {
							break;
						}
					}
					if(chongfu == false) {
						System.out.println(i);
						break;
					}
			}	
		}
		sin.close();
	}
}
