import java.io.File;
import java.io.FilenameFilter;
import java.util.Date;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import java.io.FileReader;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		StringBuilder sb = new StringBuilder();
        String strLine = "";
        try {
             BufferedReader br = new BufferedReader(new FileReader("/home/students/test.txt"));
             while (strLine != null)
             {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
             br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
	}
	
}