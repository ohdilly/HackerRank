package HackerRank;
import java.util.*;
import java.io.*;
import java.math.*;

public class MathPowLoop {
    public static void main(String []argh){	
	int a = 5;
	int b =3;
	int x = 5;
	double result = 0;
	for(int i = 0; i<x; i++) {
		
		result += b * Math.pow(2, i);
		System.out.print(result + a );
	}

}
}
