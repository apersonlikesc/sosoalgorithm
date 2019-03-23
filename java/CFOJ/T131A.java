
import java.util.Scanner;
//Ҫ�ı����:ȫ�Ǵ�д,���߿�ͷСд֮���д
public class T131A {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()) {
			String s = sin.next();
			boolean status = false;
			for(int i = 1;i<s.length();i++) {
				if(s.substring(i,i+1).matches("[a-z]")) {
					status = true;
					break;
				}
			}
			if(status == false) {
				if(s.substring(0,1).matches("[A-Z]")) {
					s = s.substring(0,1).toLowerCase()+ s.substring(1).toLowerCase();;
				}else {
					s = s.substring(0,1).toUpperCase()+ s.substring(1).toLowerCase();;
				}
			}
				System.out.println(s);
		}
		sin.close();
	}
}
