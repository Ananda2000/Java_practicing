package defaultExample;

public class DefaultMainClass {
	public static void main(String[] args) {

		DefaultMainClass gg = new DefaultMainClass();
		gg.display_deafultAccessModifier();

		// HERE CREATING THE OBJECT OF DEFAULT OUTSIDE THE CLASS. with in package..
		ClassforDeaultOutsideClass hh = new ClassforDeaultOutsideClass();
		hh.Deafault_displayOutsideclass();
		Default_outside_Package kk = new Default_outside_Package();

	}

	void display_deafultAccessModifier() {
		System.out.println("This is deafult access modifier...");
	}

}
