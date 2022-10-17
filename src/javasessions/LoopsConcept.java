package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		
		
		// 1 to 10:
		// 1. while loop:
		
				int i = 1;
				
				while (i <= 10) {
					System.out.println(i);// 1 2 3 4 5 6789 10
					i++;
					// ++i;
					// i=i+1;
				}
				
				// print 0 to 10: 0 2 4 6 8 10 -- even numbers
				
				int e = 0;
				
				while (e <= 10) {
					
					System.out.println("printing even number :" + e);// 0 2 4 6 8 10
					e = e + 2;
				}
				
				// print 1 3 5 7 9 -- odd
				
				int p =1;
				
				while(p<=10) {
					
					System.out.println("printing odd number :" + p  );
					p =p+2;
				}

				System.out.println("-----------");
				
				// infinite loop:
				
				while (true) {
					
					System.out.println(".....welcome to Taj hotel....");
					break;
				}

				System.out.println("-----------");

				// 1 to 100:
				// multiplication of 5--> print hi...
				
				int k = 1;
				
				while (k <= 100) {
					
					System.out.println(k);
					
					if (k % 5 == 0) {
						System.out.println("hi...");
					}
					
					if (k == 50) {
						System.out.println("half century....");
						// break;
					}
					
					if (k == 100) {
						System.out.println("century....");
						// break;
					}
					k++;
				}

				// use cases of while:
				
				// when number of iterations are not fixed:
				// page loading time
				// number of web elements on the page--10, 20, 40, 5
				// web table - pagination--> 1 2 3 4 5 6 7...next

				System.out.println("------");

				// 2. for loop:
				// 1 to 10:
				
				for (int t = 1; t <= 10; t++) {
					System.out.println(t);
					if (t == 5) {
						break;
					}
				}

				//
//				for(;;) {
//					System.out.println("bye");
//					//break;
//				}

				for (byte b = 1; b <= 10; b++) {
					System.out.println(b);
				}

				for (double d = 1.0; d < 10.0; d++) {
					System.out.println(d);// 1.0
				}
				
				// a to z:
				
				for (char c = 'a'; c <= 'z'; c++) {
					System.out.println(c + ":" + (int) c);
				}

				// use cases of for loop:
				
				// when number of iterations are fixed:
				// 5 elements --fixed
				
				System.out.println("--------------");

				// do-while
				//use cases: 
				//1 2 3 4 5 6....10
				
				
				//1 to 10:
				
				int q = 1;
				
				do {
					
					System.out.println(q);
					q++;
					
				}
				
				while (q<=10);
				
				System.out.println("--------------");


				// print from 10 to 1: using while and for loop
				
				int g = 10;
				
				while (g >= 1) {
					
					System.out.println(g);
					g--;
					
				}
				
				for(int l=10; l>=1; l--) {
					
					System.out.println(l);
				}
				
				
				// for each
			}

	}
