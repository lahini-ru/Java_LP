package Test;

import java.io.*;

public class UpperCase {
	
	public void printer() throws IOException {
		
		FileReader fileReader=new FileReader("Sample.txt");
		BufferedReader bufferedReader= new BufferedReader(fileReader);
		
		FileWriter fileWriter=new FileWriter("Return.txt");
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

		boolean end=false;
		int inCh;
		try {
			do {
				inCh=bufferedReader.read();
				if(inCh!=-1) {
					char outCh=Character.toUpperCase((char) inCh);
					bufferedWriter.write(outCh);
				}
				else
					end=false;
			}while(!end);
			
			bufferedReader.close();
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
