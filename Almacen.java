import java.util.ArrayList;

public class Almacen {

    //Declaracion de un ArrayList
   // Articulo[] articulos = new Articulo(null, getIndice(), getIndice(), null);
    //ATRIBUTOS
    private int indice;
    private Articulo[] articulos;

    /*
     * Constructor con 2 parametro
     */
    public Almacen(int indice, Articulo [] articulos){
        this.indice = indice;
        this.articulos = articulos;
    }

    /*
     * Metodo get
     */
    public int getIndice(){
        return this.indice;
    }

    /*
     * Metodo set
     */
    public void setIndice(int indice){
        this.indice = indice;
    }

    public void Buscar_Articulo(String Nombre){

        for (Articulo articulo : articulos) {
            if (Nombre.equalsIgnoreCase(articulo.getNombre())) {
                Nombre = articulo.getNombre();
                System.out.println();
            } 
        }
    }

    public boolean AñadirArticulo(Articulo[] a){
        String nombre = Lector.PideUnCadena("Introduzca el nombre del articulo que desea añadir");

        for (Articulo articulo : a) {
            if (articulo[]) {
                
            } else {
                
            }
        }
        
    }
}
