package oop_encapsulation;

public class REgTest {

	public static void main(String[] args) {

		// reg page:

		Registration reg = new Registration("vineeth", "vineeth.g@gmail.com");

		// go to profile page:

		System.out.println(reg.getFirstName() + " " + reg.getEmail());

		System.out.println(reg.getLastName() + " " + reg.getPhoneNumber() + " " + reg.getPassword());

		// profile page: update the info:

		reg.setLastName("vineethlavu");
		reg.setPassword("lavu");
		reg.setPhoneNumber("7736651200");

		// go to profile page:
		
		System.out.println(reg.getFirstName() + " " + reg.getEmail());

		System.out.println(reg.getLastName() + " " + reg.getPhoneNumber() + " " + reg.getPassword());

	}

}
