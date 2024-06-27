package basic19.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;

public class InputStreamReader_2 {
	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in,"UTF-8");
			int data;
			while((data=isr.read())!='\r') {
				System.out.print((char)data);
			}
			System.out.println("\n"+isr.getEncoding());
		}catch(IOException e) {}
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in,"MS949");
			int data;
			while((data=isr.read())!='\r') {
				System.out.print((char)data);
			}
			System.out.println("\n"+isr.getEncoding());
		}catch(IOException e) {}
	}
}
