import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.MessageFormat;

public class CreateInsertStatementForNAicsCode {

	public static void main(String[] args){
		//Read file		 				
		Path file = FileSystems.getDefault().getPath("d:\\documents\\sciquest\\translations","zh.txt");		
		try (InputStream in = Files.newInputStream(file);
			BufferedWriter writer = new BufferedWriter(new FileWriter("d:\\documents\\sciquest\\translations\\output.txt"));
		    BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
		    String line = null;
		    int count = 1;
		    while ((line = reader.readLine()) != null) {		        		       
		        writeFile(String.valueOf(count), "test", writer);
		        count++;
		    }		    
		    		    		    
		} catch (IOException x) {
		    System.err.println(x);
		}
	}
	
	/*
	 * Write a file
	 */
	public static void writeFile(String naicsCode, String naicsValue, BufferedWriter writer){
		// Convert the string to a
	    // byte array.	
	    String s = MessageFormat.format("Hello {0}! You have {1} messages", naicsCode, naicsValue);	    
	 // Loop over the elements in the string array and write each line.        
        try {
			writer.write(s);
			writer.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                        	  
	}
}
