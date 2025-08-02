package map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Program1 {
	public static void main(String[] args) {
		HashMap<Integer, String> aa = new HashMap<>();

		aa.put(5, "reddy1");
		aa.put(9, "Reddy2");
		aa.put(10, "Reddy3");

		System.out.println("this is testing..");
		for (Map.Entry<Integer, String> bb : aa.entrySet()) {
			System.out.println(bb.getKey() + "---" + bb.getValue());

		}

	}

}
