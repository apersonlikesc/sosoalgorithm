package lintcode;
//ltd 大数的虽然不会溢出但是还是运算太慢
import java.math.BigInteger;
import java.util.Scanner;

public class T2 {
	
	public long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
        int a = 0;
		BigInteger sum = new BigInteger("1");
		for(int i =1; i<=n;i++){
			sum = sum.multiply(new BigInteger(String.valueOf(i)));
		}
		while(sum.mod(new BigInteger("10")).equals(new BigInteger("0"))){
			a++;
			sum=sum.divide(new BigInteger("10")) ;
		}
		return a;
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		System.out.println(new T2().trailingZeros(n));
		in.close();
	}
}
