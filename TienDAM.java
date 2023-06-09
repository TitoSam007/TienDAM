public class TienDAM {
    public static void main(String[] args) throws Exception {

        int opcion;

        do {

            menu_principal();
            opcion = Lector.pideUnEntero("Introduzca una de las opciones");
            switch (opcion) {
                case 1:
                    subMenu_Almacen();
                    break;
                case 2:
                    subMenu_Pedido();
                    break;

                default:
                    break;
            }
        } while (opcion != 3);

    }

    public static void menu_principal() {
        System.out.println("Bienvenido a la TienDAM" + "\n" +
                "--------------------------" + "\n" +
                "1 Almacen" + "\n" +
                "2 Pedido" + "\n" +
                "3 Salir" + "\n" +
                "--------------------------");
    }

    public static void subMenu_Almacen() throws Exception {
        Articulo x;
        String nombre;
        double precio;
        int cantidad, iva, opcion, indice;
        boolean leido;
        do {
            System.out.println("Menu de Almacen" + "\n" +
                    "-------------------" + "\n" +
                    "1 Buscar artículo" + "\n" +
                    "2 Añadir artículo" + "\n" +
                    "3 Eliminar artículo" + "\n" +
                    "4 Recibir cantidad de un artículo" + "\n" +
                    "5 Devolver cantidad de un artículo" + "\n" +
                    "-------------------");
            opcion = Lector.pideUnEntero("Introduzca una de las opciones");

            switch (opcion) {

                case 1:
                    nombre = Lector.pideUnCadena("Introduzca el nombre del articulo que quiere buscar");
                    Almacen.buscarArticulo(nombre);
                    break;
                case 2:
                    nombre = Lector.pideUnCadena("Introduzca el nombre del nuevo articulo");
                    precio = Lector.pideUnDecimal("Introduzca el precio del nuevo articulo");
                    cantidad = Lector.pideUnEntero("Introduzca la cantidad a ingresar del nuevo articulo");
                    Articulo.imprimirTiposdeIva();
                    iva = Lector.pideUnEntero("Introduzca el numero del tipo de iva del producto");
                    switch (iva) {
                        case 1:
                            x = new Articulo(nombre, precio, cantidad, Articulo.TipoIva.general);
                            Almacen.agregarArticulo(x);
                            break;
                        case 2:
                            x = new Articulo(nombre, precio, cantidad, Articulo.TipoIva.reducido);
                            Almacen.agregarArticulo(x);
                            break;
                        case 3:
                            x = new Articulo(nombre, precio, cantidad, Articulo.TipoIva.subreducido);
                            Almacen.agregarArticulo(x);
                            break;

                        default:
                            break;
                    }
                    break;
                case 3:
                    indice = Lector.pideUnEntero("Introdúzca el indice del artículo");
                    Almacen.quitarArticulo(indice);
                    break;
                case 4:
                    try {
                        indice = Lector.pideUnEntero("Introdúzca el indice del artículo");
                        cantidad = Lector.pideUnEntero("Introduzca la cantidad que desea retirar del artículo");
                        Almacen.recibirCantidad(indice, cantidad);
                    } catch (Exception e) {
                        System.out.println(
                                "Error, la cantidad ha de ser mayor que cero y menor a la cantidad y existente");
                    }
                    break;
                case 5:
                    indice = Lector.pideUnEntero("Introdúzca el indice del artículo");
                    cantidad = Lector.pideUnEntero("Introduzca la cantidad a devolver del artículo");
                    Almacen.devolverCantidad(indice, cantidad);
                    break;

                default:
                    break;
            }
        } while (opcion != 6);

    }

    public static void subMenu_Pedido() throws Exception {
        String nombre;
        int opcion, id, cant;

        do {
            System.out.println("Menu de Pedido" + "\n" +
                    "1 Crear pedido " + "\n" +
                    "2 Añadir articulos " + "\n" +
                    "3 Quitar articulos " + "\n" +
                    "4 Modificar cantidad del artículo" + "\n" +
                    "5 Salir");

            opcion = Lector.pideUnEntero("Introduzca una de las opciones del menu");
            switch (opcion) {
                case 1:
                    nombre = Lector.pideUnCadena("Introduzca su nombre de cliente");
                    id = Lector.pideUnEntero("Introduzca la id del artículo a comprar");
                    cant = Lector.pideUnEntero("Introduzca la cantidad del artículo");

                    Pedido.crearPedido(nombre, id, cant);
                    break;
                case 2:
                    id = Lector.pideUnEntero("Introduzca la id del artículo");
                    Pedido.agregarArticulos(id);
                    break;
                case 3:
                    id = Lector.pideUnEntero("Introduzca la id del artículo");
                    Pedido.quitarArticulos(id);
                    break;
                case 4:
                    id = Lector.pideUnEntero("Introduzca el id del artículo");
                    cant = Lector.pideUnEntero("Introduzca la cantida del artículo");
                    Pedido.modificarCantidad(id, cant);
                    break;

                default:
                    break;
            }

        } while (opcion != 5);
    }
}
