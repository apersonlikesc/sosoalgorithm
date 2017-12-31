package sosoalgorithm.HDOJ;

import java.util.Scanner;
//¶¯Ì¬¹æ»®
public class T1003_1 {
	public static void main(String[] args) {
	Scanner sin = new Scanner(System.in);
	int q = 0;
	int lines = sin.nextInt();
	while(lines>0) {
		int start =1;
		int nextstart = 1;
		int length = -1;
		int end = 1;
		int low0 = 0;
		int cursum = 0;
		int number = sin.nextInt();
		int[] a = new int[number];
		for(int i = 0;i<number;i++) {
			a[i] = sin.nextInt();
		}
		int max = a[0];
		for(int i = 0;i<number;i++) {
			if(a[i]<0) {
				low0 = low0+1;
			}
			cursum = cursum+a[i];
			if(cursum < 0) {
				length = -1;
				cursum = 0;
				nextstart = i+2;
			}else {
				length++;
			}
			if(cursum>max) {
				max = cursum;
				start =nextstart;
				end = start + length;
			}
		}
		
		if(low0 == number-1 || low0 == number) {
			max = a[0];
			start = 1;
			for(int i = 0;i<number;i++) {
				if(max < a[i]) {
					max = a[i];
					start = i+1;
					
				}
			}
			end = start;
		}
		q = q+1;
		System.out.println("Case "+q+":");
		System.out.println(max+" "+start+" "+end);
		if(lines != 1) {
			System.out.println();
		}
		lines = lines -1;
	}
	sin.close();
}
}
