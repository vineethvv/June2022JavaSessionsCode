package builderPattern;

public class ShoppingTest {

	public static void main(String[] args) {
		
		
		Ecomm u1 = new Ecomm();
		
		u1.doLogin("vineeth", "vineeth123")
		 .search("Apple")
		 .addtoCart("Apple pro")
		 .makePayment("11233 123 1344 456", 123)
		 .generateOrder()
		 .logout();
		
		u1.doLogin("naveen@gmail.com", "naveen123")
		.addtoCart("iMac")
			.makePayment("1232 1212 1212 1212", 123)
				.generateOrder()
						.logout();

      //
        u1.doLogin("dev@gmail.com", "dev123")
	     .search("ipad")
			.logout();

     //
       u1.doLogin("naveen@gmail.com", "naveen123")
	        .logout();

    //
      u1.doLogin("naveen@gmail.com", "naveen123");
 
   //
     u1.doLogin()
        .search("macbook")
           .addtoCart("macbook pro")
	          .makePayment("1232 1212 1212 1212", 123)
		          .generateOrder()
			          .logout();

	}

}
