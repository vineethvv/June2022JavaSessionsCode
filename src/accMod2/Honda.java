package accMod2;

import accMod1.Car;

public class Honda extends Car {

	public static void main(String[] args) {
		
		// Honda is under different package but it is under the subclass of Car class in package accmod1.
		
		Honda h = new Honda();
		
		h.name = "unicorn";
		h.price = 10;

	}

}
