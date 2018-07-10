import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {
         int a,b,s;
         char chx,r = '=';
     System.out.println("BONJOURS (*o*) \n Veuillez saisir l'opération (deux nombre pas plus!)\n(+,-,*,^,/)");    
     Scanner sc = new Scanner(System.in);
     a = sc.nextInt();chx = sc.next().charAt(0);b= sc.nextInt();
     switch(chx) {
     case '+' : s=a+b; System.out.println("-----> "+a+chx+b+r+s);
     break; 
     case '-' : s=a-b; System.out.println("-----> "+a+chx+b+r+s);
     break; 
     case '*' : s=a*b; System.out.println("-----> "+a+chx+b+r+s);
     break;
     case '/' : s=a/b; if(b==0) System.out.println("Impossible de diviser par : 0 (");    
                else System.out.println("-----> "+a+chx+b+r+s);
     break;
     case '^' : s=a^b; System.out.println("-----> "+a+chx+b+r+s);
     break;
     default : System.out.println("Choix introuvable (-_-) "); } } }