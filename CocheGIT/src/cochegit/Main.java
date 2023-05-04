
package cochegit;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
          boolean masCoches=false;
          
           System.out.println("Quires crear un coche");
        masCoches=sc.nextBoolean();
        
         while (masCoches){//segir          
        System.out.println("Dime su matricula");
        String matricula=sc.next();
        System.out.println("Dime su numero de puertas");
        int numeroPuertas=sc.nextInt();
        System.out.println("Dime si tiene maletero");
        boolean maletero=sc.nextBoolean();
        System.out.println("Dime su color");
        String color=sc.next();
        
        CocheGIT cocheA=new CocheGIT(matricula, numeroPuertas, maletero, color);
        
        System.out.println("Quires crear otro coche");
        masCoches=sc.nextBoolean();
         }
    }
}
