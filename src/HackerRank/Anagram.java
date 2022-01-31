package HackerRank;
import java.util.Scanner;
public class Anagram {




    static boolean isAnagram(String a, String b) {
        boolean rslt = true ;
        String x = a.toLowerCase();
        char [] y = b.toLowerCase().toCharArray();
        if(a.length() != b.length()){
            return false;
        }
        for(int i =0;i < x.length(); i++){
            if (x.indexOf(y[i]) < 0 ){
                System.out.println(x.indexOf(y[i], 0) + " " + y[i] );
                rslt = false;
                break;
            }else{
                int cna=0;
                int cnb=0;
                for(int j =0;j< a.length();j++){
                    if(y[i]== a.toLowerCase().charAt(j)){
                        cna++;
                    }
                }
                for(int j =0;j< b.length();j++){
                    if(y[i]== b.toLowerCase().charAt(j)){
                        cnb++;
                    }
                }
                if (cna == cnb){
                    rslt= true;
                }else{
                    rslt = false;
                    break;
                }
                
            }
        }

        return rslt;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( ret);
    }
}
    

