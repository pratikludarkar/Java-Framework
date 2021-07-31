package Thread;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class SampleRunnable implements Runnable{

	private static final String FileName = null;

	@Override
	public void run() {
		String data="";
		 
		try {
			CustomFileWriter Writer= new CustomFileWriter();
			data=Writer.writefile("Pratiksha");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		
		
	}
	
	

}
