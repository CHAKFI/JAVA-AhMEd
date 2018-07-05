import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {
         int a,b,s;
         char chx;
     System.out.println("BONJOURS (*o*) \n Veuillez saisir l'opération (deux nombre pas plus!)");    
     Scanner sc = new Scanner(System.in);
     a = sc.nextInt();chx = sc.next().charAt(0);b= sc.nextInt();
     switch(chx) {
     case '+' : s=a+b; System.out.println("La Solution est : "+s);
     break; 
     case '-' : s=a-b; System.out.println("La Solution est : "+s);
     break; 
     case '*' : s=a*b; System.out.println("La Solution est : "+s);
     break;
     case '/' : if(b==0) System.out.println("Impossible de diviser par : 0 (");    
                else System.out.println("La Solution est : "+a/b);
     break;
     default : System.out.println("Choix introuvable (-_-) "); } } }