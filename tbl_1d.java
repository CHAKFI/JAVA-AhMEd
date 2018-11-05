import java.util.Scanner;
public class tbl_1d 
 {
	public static void main(String[] args) {
		
		int i,n=0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez entrer la taille du tableau : ");
		n = sc.nextInt();
		
		double a[] = new double[100];
		for(i=0;i<n;i++) {
			System.out.println("Veuillez entrer la note du module : "+(i+1));
			a[i] = sc.nextDouble(); 
		                 }
		
		for(i=0;i<n;i++) {
		 System.out.println("on trouve dans N°"+i+" l'élément :"+a[i] );
		                 }
		
		System.out.println("*****************************************");
		
		double som=0,moy=0;
		for(i=0;i<n;i++) {
			som = som + a[i];
			moy = (som/n);
		                 }
		                     System.out.println("La moyenne des notes : "+moy);
		System.out.println("*****************************************");
		         /*System.out.println("Que voulez vous chercher ?");
		         x = sc.nextDouble();
		         
		       double x;
	    for(i=0;i<0;i++) {
	    	        if(x = a[i]) {
	    	            	 
	    	                     }
	    	             
	                     } */
	                }
	
      }
