package HackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.


	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	
    	int cnt = scanner.nextInt();
        
        for(int i = 0; i < cnt; i++) {
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            String myString = scanner.nextLine();
            char[] charArr = myString.toCharArray();
            String oddString = "";
            String evenString = "";
            for(int j = 0; j< myString.length(); j++) {
            	int isEven = j%2;
            	if(isEven == 0) {
            		evenString += charArr[j];
            		}
            		else {
            			oddString += charArr[j];
            		}
            	}
            System.out.println(evenString.trim() + " " + oddString.trim());
            }
        
        scanner.close();
}
}
