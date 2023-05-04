
package cochegit;


public class CocheGIT {

    
   
     private String matricula;
    private int numeroPuertas;
    private boolean maletero;
    private String color;

    public CocheGIT(String matricula, int numeroPuertas, boolean maletero, String color) {
        this.matricula = matricula;
        this.numeroPuertas = numeroPuertas;
        this.maletero = maletero;
        this.color = color;
    }

    public int dameNumeroPuertas() {
        return numeroPuertas;
    }

    public boolean dameMaletero() {
        return maletero;
    }

    public String dameColor() {
        return color;
    }
        
    }
    

