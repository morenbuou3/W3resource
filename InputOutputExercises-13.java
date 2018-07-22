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
        String str_data = "";
        try {
             BufferedReader br = new BufferedReader(new FileReader("/usr/"));
             while (strLine != null)
             {
                if (strLine == null)
                  break;
                str_data += strLine;
                strLine = br.readLine();
                
            }
             System.out.println(str_data);
             br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
	}
	
}