import java.util.Scanner;
public class info {
   public static void main(String[] args) {
		String n;
		int ag;
		int id;
	System.out.println("Veuillez entrer votre Nom, Age et votre Id :\n");	
	   Scanner sc = new Scanner(System.in);
	    n = sc.nextLine();
	    ag = sc.nextInt();
	    id = sc.nextInt();
	System.out.println("\n******************************");
	System.out.println("            info              ");
	System.out.println("******************************");
	System.out.println("*   Nom : "+n);
	System.out.println("*   Age : "+ag);
	System.out.println("*   Id : "+id);
	System.out.println("******************************"); 
 }
}
