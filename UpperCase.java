package Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UpperCase{

	public void Printer() throws FileNotFoundException{
		FileReader fileReader=new FileReader(file:"/Java_Training/src/Test/Sample.txt");
		BufferedReader  bufferedReader=new BufferedReader(fileReader);
		
		
		String i;
		try {
			while((i=bufferedReader.readLine())!=null) {
				i=i.toUpperCase();
				System.out.println(i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
