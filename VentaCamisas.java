import java.util.Scanner;

public class VentaCamisas {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Inicializar la suma de precios a 0
        double sumaPrecios = 0;

        // Bucle para ingresar 5 precios de camisas en dólares
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el precio de la camisa " + i + " en dólares: ");
            double precioCamisa = scanner.nextDouble();

            // Sumar el precio al total
            sumaPrecios += precioCamisa;
        }

        // cambio de dólares a pesos
        System.out.print("Ingrese la tasa de cambio de dólares a pesos: ");
        double tasaCambio = scanner.nextDouble();

        // Calcular el total en pesos
        double totalPesos = sumaPrecios * tasaCambio;

       
        System.out.println("El total de la venta en pesos es: " + totalPesos + " pesos");

        
        scanner.close();
    }
}

