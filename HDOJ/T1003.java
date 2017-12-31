package sosoalgorithm.HDOJ;

import java.util.Scanner;
//±©Á¦
public class T1003 {
	
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		int count = sin.nextInt();
		int q = 0;
		while(count>0) {
			int lownumber = 0;
			int number = sin.nextInt();
			int[] a = new int[number];
			int start = 1;
			int end = 1;
			for(int i = 0;i<number;i++) {
				a[i]=sin.nextInt();
			}
			int max=a[0];
			for(int i =0;i<number;i++) {
				if(a[i]<0) {
					lownumber++;
				}
				int sum = a[i];
				for(int j = i+1;j<number;j++) {
					sum = sum + a[j];
				if(sum > max) {
					start = i+1;
					max = sum;
					end = j+1;
				}
				}
			}
			if(lownumber == number -1||lownumber == number) {
				for(int i = 0; i<number;i++) {
					if(max<a[i]) {
						max = a[i];
						start = i+1;
						end = start;
					}
				}
			}
			q = q+1;
			System.out.println("Case "+q+":");
			System.out.println(max+" "+start+" "+end);
			if(count != 1) {
				System.out.println();
			}
			count = count - 1;
		}
		
		sin.close();
	}
}
