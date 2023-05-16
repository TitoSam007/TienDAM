import java.util.ArrayList;

public class Almacen {

    // private Articulo[] articulos;

    public static ArrayList<Articulo> articulos = new ArrayList();

    // Atributos
    private int cantidad;
    private int indice;

    // Constructor con 2 parametros
    public Almacen(int i, int c) {
        this.indice = i;
        this.cantidad = c;
    }

    /*
     * Metodo get
     */
    public int getIndice() {
        return this.indice;
    }

    /*
     * Metodo set
     */
    public void setIndice(int indice) {
        this.indice = indice;
    }

    /*
     * Metodo set
     */
    public int getCantidad() {
        return this.cantidad;
    }

    public static boolean exists(Articulo articulo) {
        return articulos.contains(articulo);
    }

    public static void buscarArticulo(String Nombre) {

        for (int i = 0; i < articulos.size(); i++) {
            if (Nombre.equalsIgnoreCase(articulos.get(i).getNombre())) {
                System.out.println(articulos.get(i));
            } else {
                System.out.println("ERROR, no se ha encontrado el articulo introducido");
            }
        }
    }

    public static boolean agregarArticulo(Articulo atributos) {
        articulos.add(atributos);
        return true;

    }

    public static boolean quitarArticulo(int indice) {

        if (articulos.remove(indice) != null) {
            System.out.println("Artículo removido");
            return true;
        } else {
            return false;
        }
    }

    public static boolean modificarPrecio(int indice, double nuevo_precio) {

        if (indice > articulos.size()) {
            System.out.println("Error, el indice no se encuentra dentro de la lista de articulos");
            return false;
        } else {
            if (nuevo_precio < 0) {
                System.out.println("ERROR, el valor debe ser mayor a cero");
                return false;
            } else {

            }
            return true;
        }

    }

    public static boolean recibirCantidad(int indice, int cant) throws Exception{

        if (cant < 0) {
            System.out.println("ERROR, la cantidad a recibir debe ser mayor a cero");
            return false;
        } else {
            for (int i = 0; i < articulos.size(); i++) {
                if (articulos.contains(articulos.get(indice))) {
                    Articulo.disminuirCantidad(cant);
                } else {
                    System.out.println("ERROR, el numero introducido no se encuentra dentro del array");
                }
            }
            return true;
        }
    }

    public static boolean devolverCantidad(int indice, int cant) {

        if (cant < 0) {
            System.out.println("ERROR, la cantidad a devolver debe ser mayor a cero");
            return false;
        } else {
            for (int i = 0; i < articulos.size(); i++) {
                if (articulos.contains(articulos.get(indice))) {
                    Articulo.aumentarCantidad(cant);
                } else {
                    System.out.println("ERROR, el numero introducido no se encuentra dentro del array");
                }
            }
            return true;
        }
    }
}
