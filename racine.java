import java.util.Scanner;
public class racine {

	public static void main(String[] args) {
 
		int n,i;
		double r;
	     Scanner sc = new Scanner(System.in);
	     i=0;
	     do {
	    	 System.out.println("donner un nombre positif");
	    	 n = sc.nextInt();
	    	 r = Math.sqrt(n);
	    	if(n<0) {
	    		System.out.println("svp positif");
	    	}
	    
	    	 i++;
	    	 System.out.println("res : " +r);
	    	 
	     }while(n!=0);
	    	 
		
	}

}
