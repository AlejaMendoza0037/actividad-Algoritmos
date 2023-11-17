import java.util.Scanner;
//Dado N, escribir el producto desde 1 hasta N.

public class ProductoHastaN {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese un número N: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Por favor, ingrese un número positivo.");
            
            scanner.close();
            return;
        }
        // Inicializar el producto a 1
        long producto = 1;
        // Calcular el producto desde 1 hasta N
        for (int i = 1; i <= n; i++) {
            producto *= i;
        }
        
        System.out.println("El producto de 1 hasta " + n + " es: " + producto);

        scanner.close();
    }
}
