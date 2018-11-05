import java.util.Scanner;
public class MAD {

	public static void main(String[] args) {

		int n10, n5, n2=0;
		int nbf = 0;
		 for (n10=0;n10<10;n10++) {
			   for (n5=0; n5<20; n5++)
				   for (n2=0;n2<=50;n2++)
					   if (2*n2 + 5*n5 + 10*n10 == 100)
					   {
						    System.out.println("1 DH = ");
						   if(n2 != 0) {System.out.println(n2+" + ");
						                  System.out.println(n5+" X 5c");
					                   }
						      if(n10 != 0 ) {
							     if ((n2 != 0) || (n5 != 0)) System.out.println(" + ");
						                  }
						                    System.out.println(n10+" X 10c");
						                  }
		                                    System.out.println();
		                     }
		   System.out.println("En tout, il ya 66 façons de faire 1 DH");
		}
}
