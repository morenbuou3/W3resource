import java.io.File;
import java.io.FilenameFilter;
import java.util.Date;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// BufferedReader(new InputStreamReader(System.in)) Scanner(System.in)
public class Main {
	public static void main(String[] args) throws IOException {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		System.out.print("please input your text: ");
		String input = sc.nextLine();
		System.out.println(input);
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("please input your text: ");
		String input2 = read.readLine();
		System.out.println(input2);
	}
}