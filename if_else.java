import java.util.Scanner;
public class condition {
  public static void main(String[] args) {
		int t;
	System.out.println("Veuillez entrer la température en C° : ");
	Scanner sc = new Scanner(System.in);
	t = sc.nextInt();
	    if(t<=0)
	    	System.out.println("\t\t\t*****************\n\t\t\tTrès froid (*~~~*)\n\t\t\t***************** ");
	    else if(t>0 && t<=10)
	    	System.out.println("\t\t\t*****************\n\t\t\tFroid (*!*)\n\t\t\t****************");
	    else if (t>10 && t<=23)
	    	System.out.println("\t\t\t********************\n\t\t\tTempérature stable (^_^)\n\t\t\t********************");
	    else 
	    	System.out.println("\t\t\t*****************\n\t\t\tCHAUD CHAUD (*o*)\n\t\t\t***************** ");

	}
}
