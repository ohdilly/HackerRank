package HackerRank;
import java.util.*;
import java.io.*;

public class DictionaryPractice {
	
	   public static void main(String []argh){
		   Map<String, Integer> phoneBook = new HashMap<String, Integer>();
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        for(int i = 0; i < n; i++){
	            String name = in.next();
	            int phone = in.nextInt();
	            phoneBook.put(name, phone);
	        }
	        while(in.hasNext()){
	        	String Line2print;
	            String s = in.next();
	            if(phoneBook.containsKey(s)) {	
	            	Line2print = s + "=" +phoneBook.get(s);
	            }else {
	            	Line2print = "Not found";
	            }
	            System.out.println(Line2print);
	        }
	        in.close();
	    }

}
