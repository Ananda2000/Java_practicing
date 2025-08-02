//HOW TO ITERATE VALAUES FROM ENTRYSET() METHOD..

package map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Program2 {

	public static void main(String[] args) {
		Map<Integer, String> mp1 = new HashMap<Integer, String>();
		mp1.put(1, "value1");
		mp1.put(2, "value2");
		mp1.put(3, "value3");

		// Here we dispalying values from map..
		System.out.println("This is displaying using Map" + mp1);
		// Below statement displaying data using entryset() method
		System.out.println("Dispying using EntrySet() method" + mp1.entrySet());
		int jj = mp1.entrySet().size();
		System.out.println("The size is --" + jj);
		for (int i = 0; i <= jj; i++) {
			System.out.println(i + "i values.. " + mp1.get(i));
		}
	}

}
