import java.util.ArrayList;

public class Pedido {

    static ArrayList <Integer> idArticulos = new ArrayList<>();
    static ArrayList <Integer> cantidadArticulos = new ArrayList<>();

    //ATRIBUTOS
    private String nombre;
    private double porcentDescuento;
    private double subtotal;
    private double preciototal;

    public Pedido(String n, double por, double s, double pre) {
        this.nombre = n;
        this.porcentDescuento = por;
        this.subtotal = s;
        this.preciototal = pre;
    }
    
    //Metodo get
    public String getNombre(){
        return nombre;
    }

    //Metodo set
    public void setNombre(String n){
        this.nombre = n;
    }

    public static void crearPedido (String n, int id, int cant){

        agregarArticulos(id);
        cantidadArtículo(cant, id);
    }

    public static int agregarArticulos (int id){
        
        if (Almacen.articulos.contains(id)) {
            for (int index = 0; index < Almacen.articulos.size(); index++) {
            if (index == id) {
                idArticulos.add(id);
            }
        }
        } else {
            System.out.println("Error, la id introducida no se ha encontrado");
        }
        return id;    
    }

    public static void quitarArticulos (int id){
        if (Almacen.articulos.contains(id)) {
            for (int index = 0; index < Almacen.articulos.size(); index++) {
            if (index == id) {
                idArticulos.remove(id);
            }
        }
        } else {
            System.out.println("Error, la id introducida no se ha encontrado");
        }
    }

    public static boolean cantidadArtículo (int cant, int id){
        if (Almacen.articulos.contains(id)) {
            for (int index = 0; index < Almacen.articulos.size(); index++) {
            if (index == id) {
                cantidadArticulos.add(cant);
            }
        }
        return true;
        } else {
            System.out.println("Error, la id introducida no se ha encontrado");
            return false;
        }
    }

    public static void modificarCantidad(int id, int cant){
        for (int i = 0; i < idArticulos.size(); i++) {
            if (id == i) {
                cantidadArticulos.set(i, cant);
            }
        }
    }

    public String toString(){
        return "-----------------------" + "\n" +
                "     Nuevo pedido      " + "\n" +
                "Nombre del cliente: " + this.nombre + "\n" +
                "Lista de articulos: " + "\n" + 
                "id del artículo: " + idArticulos + "\n" + 
                "Cantidad del artículo: " + cantidadArticulos + "\n" + 
                "Porcentaje de descuento:" + this.porcentDescuento + "\n" +
                "Subtotal: " + this.subtotal + "\n" + 
                "Toatal: " + this.preciototal;

    }
}
