package basic19.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BUfferedInputOutputStream {
	public static void main(String[] args) {
		
		File orgfile = new File("src/basic19/IO/dog.jpg"); 
		File copyfile1 = new File("src/basic19/IO/dog_copy.jpg"); 
		File copyfile2 = new File("src/basic19/IO/dog_copy2.jpg"); 
		
		long start,end,time1,time2;
		
		start = System.nanoTime();
		try(InputStream is = new FileInputStream(orgfile);
				OutputStream os = new FileOutputStream(copyfile1);){
			int data;
			while((data=is.read())!=-1)
			{
				os.write(data);
			}
		}catch(IOException e) {e.printStackTrace();}
		
		end = System.nanoTime();
		time1 = end-start;
		System.out.println("Without BufferedXXXStream: "+time1);
		
		start= System.nanoTime();
		try(InputStream is = new FileInputStream(orgfile);
			BufferedInputStream bis = new BufferedInputStream(is);
			OutputStream os = new FileOutputStream(copyfile1);
			BufferedOutputStream bos = new BufferedOutputStream(os);
						
						){
			int data;
			while((data=is.read())!=-1)
			{
				bos.write(data);
			}
		}catch(IOException e) {e.printStackTrace();}
		
		end=System.nanoTime();
		time2 = end-start;
		System.out.println("With BufferedXXXStream: "+time2);
		System.out.println("Ratio of with and without: "+time1/time2);
	}

}
