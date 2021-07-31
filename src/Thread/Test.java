package Thread;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		/*CustomFileReader Reader=new CustomFileReader();
		String data=Reader.readfile("C:\\Users\\Public\\Documents\\Sample.txt");
		System.out.println(data);
		
		
		CustomFileWriter Writer=new CustomFileWriter();
		String data1=Writer.writefile("C:\\Users\\Public\\Documents\\Sample.txt");
		System.out.println(data1);
		*/
		
		/*SampleThread t1=new SampleThread();
		t1.setPriority(10);
		t1.setName("abc");
		t1.start();
		
		SampleThread t2=new SampleThread();
		t2.start();
		
		SampleThread t3=new SampleThread();
		t3.start();
		
		SampleThread t4=new SampleThread();
		t4.start();
		*/
		SampleRunnable s1=new SampleRunnable();
		Thread t1=new Thread(s1);
		t1.start();
		
		SampleThread t2=new SampleThread();
		t2.start();
		

	}

}

