
import java.util.Scanner;

public class T263A {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()) {
			int k = 0;
			int[][] a = new int[5][5];
			for(int i = 0;i<5;i++) {
				for(int j = 0;j<5;j++) {
					a[i][j] = sin.nextInt();
					if(a[i][j] == 1) {
						k = Math.abs(2-i)+Math.abs(2-j);
						//System.out.println(i);
						//System.out.println(j);
					}
				}
			}
			System.out.println(k);
		}
		sin.close();
	}
}
