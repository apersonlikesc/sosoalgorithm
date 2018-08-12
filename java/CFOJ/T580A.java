package sosoalgorithm.java.CFOJ;

import java.util.Scanner;

public class T580A {
public static void main(String[] args) {
	Scanner sin = new Scanner(System.in);
	while(sin.hasNext())
	{
		int n = sin.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = sin.nextInt();
		}
		int max = 0;
		int result = 0;
		for(int i = 0; i<n-1;i++) {
			if(a[i]<=a[i+1])
			{
				result++;
				if(max<result) {
					max = result;
				}
			}else {
				result = 0;
			}
		}
		System.out.println(max+1);
	}
	sin.close();
}
}
