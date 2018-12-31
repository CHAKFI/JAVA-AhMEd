import java.util.Scanner;
public class T_ct {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	    try{
	    		    
			System.out.println("Veuillez entrer l'entiers A et B pour faire la division (A/B):");
			int A = sc.nextInt();
			int B = sc.nextInt();
			int D = A/B;
			System.out.println(A+" divisée par "+B+" = "+D);
			
		  }catch (Exception e) {
			  System.out.println("Syntaxe ERREUR : "+e.getMessage());
			  // Ou bien System.out.println("IMPOSSIBLE DE DIVISER PAR ZÉRO (-_-)");
         }
	}
}
