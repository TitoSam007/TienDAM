import java.util.ArrayList;

public class Articulo {

    //Declaración de un enum para designar los tipo de iva
    public enum TipoIva{

        general("general", 0,21),
        reducido("reducido",0,10), 
        subreducido("subreducido",0,8);

        private String nombretipo;
        private double nd;

        TipoIva(String nombretipo, Double nd){
            this.nombretipo = nombretipo;
            this.nd = nd;
        }
    }
    
    //Declaración de un ArrayList
    ArrayList Atributos = new ArrayList<>();

    //ATRIBUTOS
    private String Nombre;
    private double Precio;
    private int Cantidad;
    private TipoIva iva;

    //Constructor con 3 parametros
    public Articulo(String nombre, double precio, int cantidad, TipoIva iva) {
    this.Nombre = nombre;
    this.Precio = precio;
    this.Cantidad = cantidad;
    this.iva = iva;
    }

    public TipoIva geTipoIva(){
        return this.iva;
    }

    public void seTipoavia(){
        this.iva = iva;
    }

    /*
     * Metodo get 
     */
    public String getNombre(){
        return this.Nombre;
    }
    /*
     * Metodo get
     */
    public double getPrecio(){
        return this.Precio;
    }
    /*
     * Metodo get
     */
    public int getCantidad(){
        return this.Cantidad;
    }
    /*
     * Metodo get
     */
    public Enum getTipoIva(){
        return this.iva;
    }
    /*
     * Metodo set
     */
    public void setPrecio(double Precio){
        Precio = Lector.PideUnDecimal("Introduzca el precio del Articulo: ");
        this.Precio = Precio;
    }

    //Metodo que aumenta la cantidad de un articulo
    public void AumentarCantidad(int cantidad){
        this.Cantidad += cantidad;
    }

    //Metodo que disminuye la cantidad de una Articulo
    public void DisminuirCantidad(int cantidad){
        this.Cantidad -= cantidad;
    }

    //Declaración de un metodo de tipo String que imprime los atributos de la clase articulo.
    public String toString(){
        return "Nombre: " + this.Nombre + "\n" + 
                "Precio: " + this.Precio + "\n" +
                "Tipo de IVA: " + this.iva + "\n" +
                "Cantidad: " + this.Cantidad;
    }


}