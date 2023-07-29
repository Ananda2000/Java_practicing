package simpleTextFile;

import java.io.File;

public class SimpleFile2 
{
	public static void main(String [] args)
	{
		File fle = new File("D:\\FileHandlingPRactice\\kumar.txt");
		
		System.out.println("CANEXECUTE() THE FILE---"+fle.canExecute());
		
		System.out.println("CanRead() the file ---"+fle.canRead());
		
		System.out.println("getName() the file name -- "+fle.getName());
		
		System.out.println();
	}

}
