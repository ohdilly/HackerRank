package HackerRank;
import java.util.*;

public class palindrome {

    public static void main(String [] Args){
    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    /* Enter your code here. Print output to STDOUT. */
    String sb = new StringBuffer(A).reverse().toString();
    sc.close();
    if (A.compareTo(sb)==0){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }

    
    }
}
