package sosoalgorithm.java.CFOJ;

import java.util.Scanner;

public class T236A {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNext()) {
			String a =sin.next();
			int count = 0;
			boolean find = false;
			for(int i = 0;i<a.length();i++) {
				find = false;
				for(int j = i+1;j<a.length();j++) {
					if(a.charAt(i) == a.charAt(j)) {
						find = true;
						break;
					}
				}
				if(find == false) {
					count++;
				}
		}
			if(count%2 == 1) {
				System.out.println("IGNORE HIM!");
			}else {
				System.out.println("CHAT WITH HER!");
			}
		}
		sin.close();
	
	}
	}
