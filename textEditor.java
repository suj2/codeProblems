package java_coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class textEditor {

	public static void main(String args[]) throws IOException
	{
		String[] lines= new String[50];
		int i= -1;
		System.out.println("This is your pocket mini-editor"); 
		
			do {
			i++;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			lines[i] = (String)br.readLine();
			
			}while(!(lines[i].equals(":wq"))); 
		
		
			System.out.println("Here is your editor");
			i =0; 
			while(!(lines[i].equals(":wq")))
			{
				System.out.println(lines[i]); 
				i++;
			}
		}
		
		
	}

