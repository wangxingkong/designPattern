package design_pattern.decorator.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputSteam extends FilterInputStream{

	protected LowerCaseInputSteam(InputStream in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	public int read() throws IOException {
		int c=in.read();
		return (c==-1)?c:Character.toLowerCase((char)c);
	}

	public int read(byte[] b,int offset,int len)throws IOException {
		int result=in.read(b,offset,len);
		for(int i=offset;i<offset+result;i++)
			b[i]=(byte)Character.toLowerCase((char)b[i]);
		return result;
	}
	
}
