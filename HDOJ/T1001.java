package sosoalgorithm.HDOJ;

import java.util.Scanner;

public class T1001 {
	public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        while(ss.hasNextInt()){
            Double a=ss.nextDouble();
            System.out.println((int)((1+a)*a/2));
            System.out.println();
        }
        ss.close();
    }
}
