package HackerRank;

import java.util.*;

public class FileEof {

	static Scanner read = new Scanner(System.in);
	
	public static void main(String[] args) {
		String contents = "";
		// TODO Auto-generated method stub
		while(read.hasNextLine()) {
			contents += read.nextLine();
		}
		System.out.println(contents);
	}

}
