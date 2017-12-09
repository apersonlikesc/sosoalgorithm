package lintcode;
import java.util.Scanner;

public class T2_1 {
	
	public long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
        long a = 0;//统计0的个数
		while(n>0) {
			a++;
			n=n/5;
		}
		return a;
	}
	
	public long trailingZeros2(long n) {
		long a = 0;
		for(int i = 5; i<n ; i=i+5) {
			int j = i;
			while(j %5 == 0) {
				a++;
				j = j/5;
			}
		}
		return a;
	}
public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		System.out.println(new T2_1().trailingZeros(n));
		System.out.println(new T2_1().trailingZeros2(n));
		in.close();
	}
}
