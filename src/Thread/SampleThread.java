package Thread;

import java.io.IOException;

public class SampleThread extends Thread{
	private static final String FileName = "C:\\Users\\Public\\Documents\\Sample.txt";

	@Override
	public void run()
	{
	    
		String data=null;
		CustomFileReader Reader=new CustomFileReader();
		try {
			data=Reader.readfile(FileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(data);
		System.out.println("Thread name is:"+Thread.currentThread().getName());
		
		
	}

}
