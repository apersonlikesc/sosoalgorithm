package sosoalgorithm.HDOJ;
import java.math.BigInteger;  
import java.util.Scanner;  
  
 
public class T1002{

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int count = cin.nextInt();
        for(int i = 0;i<count;i++){
        	BigInteger a = cin.nextBigInteger();
        	BigInteger b = cin.nextBigInteger();
        	System.out.println("Case "+(i+1)+":");
        	System.out.print(a);
	    	System.out.print(" + "+b);
	    	
	    	System.out.println(" = "+a.add(b));
	    	if(i == count -1)
	    		break;
            System.out.println();
        }
        cin.close();
    }
}

