// Implementing the andThen() method in below program...

package fUNCTIONAL_INTERFACE;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_andThenMethiod 
{
	public static void main(String [] args)
	{
	
      
      Consumer<List<Integer> > modify = list ->
      {
          for (int i = 0; i < list.size(); i++)
              list.set(i, 2 * list.get(i));
      };

      Consumer<? super List<Integer>> dispList = list -> list.stream().forEach(a -> System.out.print(a +" "));
	
      List<Integer> list = new ArrayList<Integer>();
      list.add(2);
      list.add(1);
      list.add(3);
      
      modify.andThen(dispList).accept(list);
	}
	
	  
	
      

}
