package exceptionHandling;

public class TryCatchBlock {
	
	// Error & Exception both are different
	
	String name;

	public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		int a = 9;
		int b = 0;
		
		try {
			
			TryCatchBlock obj = new TryCatchBlock();
			
			obj = null;
			obj.name = "vineeth";
			
			int i = a/b;
			
			System.out.println("hello");
			System.out.println("hello");
			System.out.println("hello");
			
		} catch (ArithmeticException e) {
			
			System.out.println("AE is coming....");
			e.printStackTrace();
					
		}
		
		catch (NullPointerException e) {
			System.out.println("NPE is coming....");
			e.printStackTrace();
		}
		
		catch (Error e) {
			System.out.println("NPE is coming....");
			e.printStackTrace();
		}

		System.out.println("bye");

	}

}
