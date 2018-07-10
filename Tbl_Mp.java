import java.util.Scanner;
public class Tbl_Mp {
	public static void main(String[] args) {
		
		int j,n,s;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrer un nombre");
		n = sc.nextInt();
		System.out.println("~~ Tableau de Multiplication de : "+n+" ~~");
		
		    	for(j=0;j<11;j++) {
		         s=n*j;
		 		System.out.println( +n+" * "+j+" = "+s);
                    }
                 }
             }