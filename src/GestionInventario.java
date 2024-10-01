import java.util.sc;

public class GestionInventario {
    public static void main(String[] args) {
        String[] nombres = new String[5];
        int[] cantidades = new int[5];
        double[] precios = new double[5];
        int numProd = 0;

        Scanner sc = new sc(System.in);

        while (true) {
            System.out.println("\n1. Agregar producto");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();

            if (opcion == 1) {
                if (numProd < 5) {
                    System.out.print("Nombre del producto: ");
                    nombres[numProd] = sc.next();
                    System.out.print("Cantidad: ");
                    cantidades[numProd] = sc.nextInt();
                    System.out.print("Precio: ");
                    precios[numProd] = sc.nextDouble();
                    numProd++;
                } else {
                    System.out.println("Inventario lleno");
                }
            } else if (opcion == 2) {
                System.out.println("\nInventario actual:");
                for (int i = 0; i < numProd; i++) {
                    System.out.println(nombres[i] + " - Cantidad: " + cantidades[i] + " - Precio: $" + precios[i]);
                }
            } else if (opcion == 3) {
                break;
            } else {
                System.out.println("Opción no válida");
            }
        }
        sc.close();
    }
}
