public class TienDAM {

    public static void main(String[] args) {

        /*
         * String nombre;
         * Double precio;
         * int cantidad;
         * Articulo.TipoIva iva ;
         * Articulo articulo = new Articulo(nombre, precio, cantidad, iva);
         */

        int opcion;

        do {

            Menu_principal();
            opcion = Lector.PideUnEntero("Introduzca una de las opciones");
            switch (opcion) {
                case 1:
                    SubMenu_Almacen();
                    break;
                case 2:

                    break;

                default:
                    break;
            }
        } while (opcion != 3);

    }

    public static void Menu_principal() {

        System.out.println("Bienvenido a la TienDAM" + "\n" +
                "--------------------------" + "\n" +
                "1 Almacen" + "\n" +
                "2 Pedido" + "\n" +
                "3 Salir" + "\n" +
                "--------------------------");
    }

    public static void SubMenu_Almacen() {
        int opcion;
        do {

            System.out.println("SubMenu de Almacen" + "\n" + 
                                "-------------------" + "\n" +
                                "1 Ver" + "\n" +
                                "2 Buscar" + "\n" +
                                "3 Añadir" + "\n" +
                                "4 Recibir" + "\n" +
                                "5 Devolver" + "\n" +
                                "-------------------");
            opcion = Lector.PideUnEntero("Introduzca una de las opciones");

            switch (opcion) {

                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;

                default:
                    break;
            }
        } while (opcion != 6);

    }

    public static void SubMenu_Pedido() {

    }
}
