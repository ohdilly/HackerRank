package HackerRank;
//import java.io.*;
import java.util.*;

public class TokenPractice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String s1 = s.replaceAll("[^\\dA-Za-z ]", " ");
        StringTokenizer st = new StringTokenizer(s1);
        int cnt = st.countTokens();
        System.out.println(cnt);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        scan.close();
    }
}