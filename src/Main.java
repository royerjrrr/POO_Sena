import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Pedimos los datos del producto
        System.out.println("Consulte numero de producto a manejar: ");
        Scanner sc = new Scanner(System.in);
        int producto = sc.nextInt();
        //Declaramos el Hashmap
        HashMap<Integer, bodega> bodegas = new HashMap<>();

        //Ciclo para llenar
        System.out.println("Por favor ingresar los datos requeridos");
        for(int i= 0; i<producto; i++){
            System.out.println((i + 1) +" Numero de codigo: ");
            Integer codigo = sc.nextInt();

            System.out.println((i + 1) +" Precio del producto: ");
            Integer precio = sc.nextInt();

            System.out.println((i + 1) +" Cantidad de la bodega: ");
            Integer cantBodega = sc.nextInt();

            System.out.println((i + 1) +" Cantidad minima de bodega: ");
            Integer minBodega = sc.nextInt();

            // Creamos un nuevo objeto almacen y lo agregamos al HashMap
            bodega almacen = new bodega(codigo, precio, cantBodega, minBodega);
            bodegas.put(codigo,almacen);
        }
        //Mostramos datos sobres las bodegas, recorriendo el Hashmap
        for (Map.Entry<Integer, bodega> entrada : bodegas.entrySet()) {
            bodega productoActual = entrada.getValue();
            int cantBodegaActual = productoActual.getCantBodega();
            int minBodegaActual = productoActual.getMinBodega();

            // Mostramos la información del producto
            System.out.println("Código: " + productoActual.getCodigo());
            System.out.println("Precio: " + productoActual.getPrecio());
            System.out.println("Cantidad en bodega: " + productoActual.getCantBodega());
            System.out.println("Cantidad mínima en bodega: " + productoActual.getMinBodega());
            System.out.println();

            // Verificamos si la cantidad en bodega es menor o igual a la cantidad mínima
            if (cantBodegaActual <= minBodegaActual) {
                // Mostramos una alerta
                System.out.println( " ¡Alerta! La cantidad en bodega del producto " + productoActual.getCodigo() + " es igual o menor a la cantidad mínima.");
            }

    }

}
}

