package Thread;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CustomFileReader {
	public String readfile(String FileName) throws IOException
	{
		String data="";
		FileReader reader=new FileReader(FileName);
		int i=reader.read();
		while(i!=-1)
		{
			
			data=data+(char)i;
			i=reader.read();
			
		}
		reader.close();
		
		return data;
		
	}

	public String read() {
		// TODO Auto-generated method stub
		return null;
	}

}
