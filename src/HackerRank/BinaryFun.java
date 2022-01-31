package HackerRank;
//import java.util.Scanner;

public class BinaryFun {
	

public static void main(String[] args) {
	   // Scanner in = new Scanner(System.in);
    int n = 63 ;//in.nextInt();
    int remd=0;
    int sL=0;
    int tot=0;
    while(n>0)
        {
        remd=n%2;
        n=n/2;
        if(remd==1)
         {   sL++;
           if(sL>=tot)

            tot=sL;

        }
        else{

            sL=0;
        }   
    }

    System.out.println(tot);
}

}
