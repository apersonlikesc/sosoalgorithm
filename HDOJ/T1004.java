package sosoalgorithm.HDOJ;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
//it should remember the String
public class T1004 {
	public static void main(String[] args) {
		int max = 0;
		String popular = "";
		Scanner sin = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();
		while(true) {
		int number = sin.nextInt();
		if(number == 0)
			break;
		for(int i = 0;i<number;i++) {
			String s =sin.next();
			if(!map.containsKey(s)) {
				//Integer q = new Integer(0);
				map.put(s, 1);
			}else {
				//Integer q = new Integer(map.get(s)+1);
				map.put(s, map.get(s)+1);
			}
		}
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String str = it.next();
			//System.out.println("values:"+str);
		//	System.out.println(map.get(str));
			if(max<map.get(str)) {
				max = map.get(str);
				popular = str;
			}
		}
		System.out.println(popular);
		max = 0;//需要将max再次赋值
		map.clear();
		
		
}
		sin.close();
		}
		
}
