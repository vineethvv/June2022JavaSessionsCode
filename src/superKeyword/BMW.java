package superKeyword;

public class BMW extends Car {

	// Super keyword is used when we have common properties b/w the parent and child
	// which is non static , here min speed is common for both car & bmw but it is
	// non static
    // If min speed is static then we can use the class name to call it
	
	int minSpeed = 200;
	
	// Super keyword is also used to call the parent class constructor from the child class constructor but the super keyword should be the 1st statement in the child class 
	// constructor always
	
	public BMW() {
		//super(10);//first statement
		super();
		System.out.println("BMW default const....");
	}
	
	
	@Override
	public void getMileage() {
		super.getMileage();
		System.out.println("BMW mileage is 18");
		
	}

	public void displaySpeed() {
		System.out.println("BMW speed: " + minSpeed);// 200

		System.out.println("Car speed :" + super.minSpeed); // Here super keyword is used to call the min speed of class
															// car

	}

}
