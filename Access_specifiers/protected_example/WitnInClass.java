package protected_example;

import commonclasses.Protect_Example;

public class WitnInClass extends Protect_Example {
	public static void main(String[] args) {

		//
		Class1 c1 = new Class1();
		c1.display();
		WitnInClass pp = new WitnInClass();
		pp.display_outsidepackage();

	}

}
