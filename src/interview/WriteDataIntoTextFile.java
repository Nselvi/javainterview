package interview;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fl=new FileWriter("C:\\Users\\nselv\\Desktop\\Text123.txt");
		BufferedWriter bw=new BufferedWriter(fl);
		
		bw.write("Selenium with Java");
		bw.write("Selenium with Python");
		bw.write("Selenium with C#");
		
		System.out.println("Finished!!!");
		
		FileReader fr=new FileReader("C:\\Users\\nselv\\Desktop\\Text123.txt");
		BufferedReader br=new BufferedReader(fr);
		bw.close();
		
		
		String str;
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
			
		br.close();
		
		
		//Approach 2
		File file=new File("C:\\Users\\nselv\\Desktop\\Text123.txt");
		Scanner sc=new Scanner(file);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		
		
		


	}

}

