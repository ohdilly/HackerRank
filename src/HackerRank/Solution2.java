package HackerRank;
import java.io.*;
import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
    	String gt;
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int slen = A.length() + B.length();
        if (A.compareTo(B) > 0){
             gt = "Yes";
        }else{
             gt = "No";
        }
        char x = A.charAt(0);
        char X = Character.toUpperCase(x);
        String A2 = A.replace(A.charAt(0), X);
        x = B.charAt(0);
        X = Character.toUpperCase(x);
        String B2 = B.replace(B.charAt(0), X);
        System.out.println(slen);
        System.out.println(gt);
        System.out.println(A2 + " " + B2);
        
    }
}