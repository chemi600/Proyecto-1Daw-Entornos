package cochegit;


public class Almacen {
    private int tamañoAlmacen;
    CocheGIT[]almacen;
    private int cont=0;
    

    public Almacen(int tamañoAlmacen)throws Exception{
        if(tamañoAlmacen<=0){
            throw new Exception("El almacen debe ser mayor a 0");
        }
        this.tamañoAlmacen = tamañoAlmacen;
        almacen=new CocheGIT[this.tamañoAlmacen];
    }
    
    public void insertarCoche(CocheGIT coche) throws Exception{
        if(this.cont>this.tamañoAlmacen){
            throw new Exception("No hay espacio para insertar más coches");
        }
        this.almacen[cont]=coche;
        cont++;
    }
    
     public int sumaPuertas(){
        int puertas=0;
        for(int i=0;i<this.almacen.length;i++){
            puertas=puertas+this.almacen[i].dameNumeroPuertas();
        }
        return puertas;
    }
}
