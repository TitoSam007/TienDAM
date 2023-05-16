public class Articulo {

    //ATRIBUTOS
    private String nombre;
    private double precio;
    private static int cantidad;
    private TipoIva iva;

    //Declaración de un enum para designar los tipo de iva
    public enum TipoIva{
        
        general,  reducido, subreducido;

        /*private double nd;

        TipoIva(Double nd){
            this.nd = nd;
        }*/
    }
    
    //Declaración de un ArrayList
    //ArrayList Atributos = new ArrayList<>();

    //Constructor con 4 parametros
    public Articulo(String n, double p, int c, TipoIva i) {
    this.nombre = n;
    this.precio = p;
    Articulo.cantidad = c;
    this.iva = i;
    }

    /*
     * Metodo get
     */
    public String getNombre() {
        return nombre;
    }

    /*
     * Metodo get
     */
    public double getPrecio() {
        return precio;
    }

    /*
     * Metodo get
     */
    public int getCantidad() {
        return cantidad;
    }

    /*
     * Metodo get
     */
    public TipoIva getIva() {
        return iva;
    }


    /*
     * Metodo set
     */
    public void setPrecio(double p) throws Exception{
        if (p > 0) {
            this.precio = p;
        }
        else{
            throw new Exception("ERROR, debe introducir un valor mayor a cero.");
        }
            
        
    }

    //Metodo que aumenta la cantidad de un articulo
    public static void aumentarCantidad(int cant){
            if (cant > 0) {
                cantidad += cant;
            }

    }
    //Metodo que disminuye la cantidad de una Artículo
    public static void disminuirCantidad(int cant){
            if (cant > 0 || cant < Articulo.cantidad) {
                cantidad -= cant;
            }
    }
    //Declaración de un metodo de tipo String que imprime los atributos de la clase articulo.
    public String toString(){
        return "Nombre: " + this.nombre + "\n" + 
                "Precio: " + this.precio + "\n" +
                "Tipo de IVA: " + this.iva + "\n" +
                "Cantidad: " + Articulo.cantidad;
    }

    public static String imprimirTiposdeIva() {
        return "Tipos de iva:" + "\n" +
                "general" + "0.21" + "\n" + 
                "reducido" + "0.10" + "\n" +
                "subreducido" + " 0.8";
    }

    public boolean exists(String nom) {
        return false;
    }
}