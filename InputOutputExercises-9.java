import java.io.File;
import java.io.FilenameFilter;
import java.util.Date;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// file.length() Bytes
public class Main {
	public static void main(String[] args) throws IOException {
		// Write your code here
		File file = new File("/usr/");
		if (file.exists()) {
			System.out.println(fileSizeBytes(file));
			System.out.println(fileSizeKBytes(file));
			System.out.println(fileSizeMBytes(file));
		}
	}
	
	private static String fileSizeBytes (File file) {
		return (double) file.length() + "B";
	}
	
	private static String fileSizeKBytes (File file) {
		return (double) file.length() / 1024 + "kb";
	}
	
	private static String fileSizeMBytes (File file) {
		return (double) file.length() / (1024 * 1024) + "mb";
	}
	
}