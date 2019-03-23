
import java.util.Scanner;

public class T160A {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()) {
			int number = sin.nextInt();
			int sum = 0;
			int mymoney= 0;
			int count = 0;
			int[] a = new int[100];
			for(int i = 0;i<number;i++) {
				int  j = sin.nextInt();
				sum = sum + j;
				a[j-1] = a[j-1] + 1;
			}
			for(int i = 99;i>=0;i--) {
				while(a[i]>0 && mymoney <=sum/2) {
					mymoney = mymoney + i+1;
					count = count + 1;
					a[i]--;
				}
				if(mymoney >sum/2) {
					break;
				}
			}
			System.out.println(count);
		}
		sin.close();
	}
}
