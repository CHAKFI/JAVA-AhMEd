import java.util.Scanner;


public class fct {
	
	int som(int n1, int n2){
		int x;
		x = n1+n2;
		return x;
		}

	public static void main(String[] args) {
		
		fct s = new fct();
		int a,b,R;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir A et B : ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		R = s.som(a,b);
		
		System.out.println("La somme de "+a+" et "+b+" est : "+R);
		
	}

}
