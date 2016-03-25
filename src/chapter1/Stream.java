package chapter1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream {
	public static void main(String []args) throws IOException{
		FileOutputStream out = new FileOutputStream(new File("out.txt"),true);
		out.write("Hello world\n".getBytes());
		out.flush();
		out.close();
	}
}
