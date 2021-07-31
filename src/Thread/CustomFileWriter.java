package Thread;

import java.io.FileWriter;
import java.io.IOException;

public class CustomFileWriter {
	public String writefile(String FileName) throws IOException
	{
		
		String data="";
		 FileWriter Writer=new FileWriter(FileName, true);
		
		 Writer.append("Pratiksha");
		 Writer.close();
		 return FileName;
		
	}
	

}

