/**
 * 
 */
package HackerRank;

import java.util.Scanner;
import java.lang.Math;

/**
 * @author kevindill200112
 *
 */
public class isPrime {

	/**
	 * @param args
	 */

	static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean test = false;
		int cnt = read.nextInt();
		int[] testPrime = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			read.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			testPrime[i] = read.nextInt();
		}
		for (int j : testPrime) {
			double sq = Math.sqrt(j);
			for (int k = 2; k < sq; k++) {
				if (j % k == 0) {
					test = true;
					break;
				}

			}
			if (test) {
				System.out.println("Not Prime");
			} else {
				System.out.println("Prime");
			}
			test = false;
		}
	}
}