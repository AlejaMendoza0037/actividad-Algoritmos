import java.util.Scanner;

public class RegistroRestaurante {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        // Inicializar el total de pagos a cero
        double total_Pagos = 0;

        //  consumo de clientes
        char deseaIngresarOtro = 's';
        while (Character.toLowerCase(deseaIngresarOtro) == 's') {
                        System.out.print("Ingrese el consumo del cliente: ");
            double consumo_Cliente = scanner.nextDouble();

            // Verificar si se aplica descuento del 20%
            if (consumo_Cliente > 50000) {
                consumo_Cliente *= 0.8;  // Aplicar descuento del 20%
            }

            total_Pagos += consumo_Cliente;
            
            System.out.print("¿Desea ingresar otro consumo? (s/n): ");
            deseaIngresarOtro = scanner.next().charAt(0);
        }
        
        System.out.println("El total de pagos es: " + total_Pagos + " pesos");

        scanner.close();
    }
}
