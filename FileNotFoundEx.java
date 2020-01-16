package Exception;

import java.io.*;

public class FileNotFoundEx {
	
	public void fileNotFound() {
		try { 
			
            File file = new File("D://Sample.txt"); 
            FileReader fileReader = new FileReader(file); 
            
            System.out.println(fileReader.toString());
        } 
		catch (FileNotFoundException e) { 
           System.out.println("File not found"); 
        } 
	}

}
