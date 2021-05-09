package myFilesEditor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStreamReader rd = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(rd);
		
		String line ="stop";
		ArrayList<String> Data = new ArrayList<String>();
		do{
			try {
				System.out.print("Enter Data :");
				line = br.readLine();
				if(!line.equals("stop")){
					System.out.println("Data: "+line);
					Data.add(line);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}while(!line.equals("stop"));
		//System.out.println(Data);

		try {
			FileWriter wf = new FileWriter("myOutput.txt");
			BufferedWriter bw = new BufferedWriter(wf);
			for(String l:Data){
				bw.write(l+"\r\n");
			}
			bw.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}

}
