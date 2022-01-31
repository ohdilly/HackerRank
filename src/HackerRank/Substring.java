package HackerRank;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Substring {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int sLen = s.length() - (k-1);
        ArrayList<String> al = new ArrayList<String> ();
        for(int i=0; i< sLen; i++){
            al.add(s.substring(i, i+k));
        }
        Collections.sort(al);
        smallest = al.get(0);
        Collections.sort(al, Collections.reverseOrder());
        largest = al.get(0);
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}