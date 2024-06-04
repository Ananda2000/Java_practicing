package arrays;

public class Simple_array1 
{
	public static void main(String [] args)
	{
		int[] arr ; // Declaring the array type as integer 'arr' --> array name.
		arr = new int [5]; // Here we initializing array size of 5...
		
		// BELOW INITIALIZING THE VALUE TO ARRAYS...
		arr[0]=5;
		arr[1]=10;
		arr[2]=12;
		arr[3]=20;
		arr[4]=23;
		
		// DISPLAYING OF ARRYA ELEMENTS...USING FOR LOOP..
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
	// DISPLAY OF ARRAY ELEMENTS .. USING FOREACH LOOP..
		for (int i : arr) 
		{
			System.out.println(i);
		}
		
	}

}
