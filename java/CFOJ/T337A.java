
import java.util.Scanner;

public class T337A {
public static void main(String[] args) {
	Scanner sin = new Scanner(System.in);
	while(sin.hasNext()) {
		int n = sin.nextInt();
		int m = sin.nextInt();
		int[] a = new int[m];
		for(int i = 0;i<m;i++) {
			a[i] = sin.nextInt();
		}
		
		for(int i = 0;i<a.length-1;i++) {
			int min = a[i];
			for(int j = i+1;j<a.length;j++) {
				if(a[j] < min) {
					min = a[j];
					a[j] = a[i];
					a[i] = min;
				}
			}
		}
		int min = a[n-1] - a[0];
		for(int i = 1;i<a.length-n+1;i++) {
			if(a[i+n-1] - a[i] < min) {
				min = a[i+n-1] - a[i];
			}
		}

			System.out.println(min);

	}
	sin.close();
}
}
