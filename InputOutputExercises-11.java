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

// read by line from file
public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader br = null;
        String strLine = "";
        try {
            br = new BufferedReader( new FileReader("/usr/"));
            while( (strLine = br.readLine()) != null){
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