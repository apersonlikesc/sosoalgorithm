
import java.util.Scanner;

public class T122A {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()) {
			String s = sin.next();
			boolean status = false;
			int[] a = {4,44,444,7,77,777,47,74,474,747,477,744};
			if(s.matches("((4|7)*?)")){
				System.out.println("YES");
			}else {
				for(int i = 0;i<a.length;i++) {
					if(Integer.valueOf(s)%a[i] == 0) {
						System.out.println("YES");
						status = true;
						break;
					}
				}
				if(status == false) {
					System.out.println("NO");
				}
				
				
			}
		}
		sin.close();
	}
}
