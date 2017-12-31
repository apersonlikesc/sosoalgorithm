package sosoalgorithm.HDOJ;

import java.util.Scanner;

public class T1000 {

    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        while(ss.hasNextInt()){
            int a=ss.nextInt();
            int b=ss.nextInt();
            System.out.println(a+b);
        }
        ss.close();
    }

}
