package HackerRank;

import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;
import java.math.BigInteger; 

public class sha256 {


 public static void main (String[] args){   
    Scanner scan = new Scanner(System.in);
    String text= scan.next();
    scan.close();

try{
MessageDigest digest = MessageDigest.getInstance("SHA-256");
byte[] hash = digest.digest(text.getBytes(StandardCharsets.UTF_8));
BigInteger N = new BigInteger(1, hash);
String encoded = N.toString(16);
while(encoded.length()< 64){
    encoded = "0" + encoded;
}
System.out.println(encoded);
}
catch(NoSuchAlgorithmException e){
    System.out.println("No Such Algo");
}

}
}
