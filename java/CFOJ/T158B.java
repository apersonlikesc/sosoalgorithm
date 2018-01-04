package sosoalgorithm.java.CFOJ;

import java.util.Scanner;

public class T158B {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()) {
			int number = sin.nextInt();
			int[] a = new int[4];
			int numberOfTaxi = 0;
			for(int i = 0; i<number;i++) {
				int k = sin.nextInt();
				a[k-1] = a[k-1]+1;
			}
			numberOfTaxi = a[3];
			if(a[0]>a[2]) {
				a[0] = a[0] - a[2];
			}else {
				a[0] = 0;
			}
			numberOfTaxi = numberOfTaxi + a[2];
			if(a[1]%2 == 0) {
				numberOfTaxi = numberOfTaxi+a[1]/2;
				a[1] = 0;
			}else {
				numberOfTaxi = numberOfTaxi+a[1]/2;
				a[1] = 1;
			}
			if(a[1]==0) {
				if(a[0]%4>0) {
					numberOfTaxi = numberOfTaxi + a[0]/4 +1;
				}else {
					numberOfTaxi = numberOfTaxi + a[0]/4;
				}
			}else {
				if(a[0]>1) {
					a[0] = a[0] - 2;
					numberOfTaxi = numberOfTaxi+1;
					if(a[0]%4>0) {
						numberOfTaxi = numberOfTaxi + a[0]/4 +1;
					}else {
						numberOfTaxi = numberOfTaxi + a[0]/4;
					}
				}else {
					numberOfTaxi = numberOfTaxi+1;
				}
			}
			System.out.println(numberOfTaxi);
		}
		sin.close();
	}
}
