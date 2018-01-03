package sosoalgorithm.java.CFOJ;

import java.util.Scanner;

public class T4A {
public static void main(String[] args) {
	Scanner sin = new Scanner(System.in);
	while(sin.hasNext()) {
	int a = sin.nextInt();
	if(a== 2) {
		System.out.println("no");
	}else if(a%2 == 0) {
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}	
	}
	
	sin.close();
}
}
