package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	Difference(int[] a){
		this.elements = a;
	}
	
	int computeDifference() {
		maximumDifference = 0;
		for(int i=0; i < elements.length;i++) {
			int x = elements[i];
			for( int j =0; j<elements.length;j++) {
				int s = 0;
				s = Math.abs(x-elements[j]);
				if(s>maximumDifference) {
					maximumDifference = s;
				}
			}
		};
		return maximumDifference;
	}
} // End of Difference class

public class ScopePractice {

    public static void main(String[] args) {

        int[] a = {3,5,7,9,11,13,15};
        


        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
