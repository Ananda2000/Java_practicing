package simpleTextFile;
// IN THIS PROGRAM WE ARE CHECKING THE FILE, IF IT NOT EXISTS, CREATE THE FILE,, ELASE IT WILL DISPLAY 
// FILE ALREADY PRESENT MESSAGE//.



import java.io.File;
import java.io.IOException;

public class SimpleFile_creation 
{
	public static void main(String [] args) throws IOException
	{
		File filess = new File("D:\\FileHandlingPRactice\\kumar.txt");
		
		if(filess.exists())
		{
			System.out.println("file already present");
		}
		else
		{
			filess.createNewFile();
			System.out.println("File created successfully");
		}
	}

}
