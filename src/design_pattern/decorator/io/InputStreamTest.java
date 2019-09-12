package design_pattern.decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public static void main(String[] args) throws IOException {
		int c;
		InputStream inputStream=null;
		inputStream=new LowerCaseInputSteam(new BufferedInputStream(new FileInputStream("G:\\test-workplace7\\design_pattern\\src\\design_pattern\\decorator\\io\\test.txt")));
		try {
			while((c=inputStream.read())>=0)
				System.out.print((char)c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(inputStream!=null)
				inputStream.close();
		}
	}
	
}
