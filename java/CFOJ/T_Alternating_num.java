
import java.util.Scanner;

public class T_Alternating_num {	
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			Scanner sin = new Scanner(System.in);
			while(sin.hasNext()) {
				int n,a,b,k;
				n = sin.nextInt();
				a = sin.nextInt();
				b = sin.nextInt();
				k = sin.nextInt();
				String s = sin.next();
				String s_part = "";
				double sum = 0;
				for(int i = 0;i<=n;i++) {
					double f = Math.pow(a, n-i) * Math.pow(b, i);
					if(s.length()==1) {
						s_part = s.substring(0, 1);
					}else {
						s_part = s.substring(i%k, (i%k)+1);
					}
					if("-".equals(s_part)) {
						f = -f;
					}
				//	System.out.println(f);
					sum += f;
				}
				sum = sum%(Math.pow(10, 9)+9);
				if(sum < 0) {
					sum+=Math.pow(10,9)+9;
				}
				System.out.println((int)sum);
				
			}
			sin.close();
		}
}
