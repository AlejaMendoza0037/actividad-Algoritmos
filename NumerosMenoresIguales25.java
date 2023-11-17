import java.util.Scanner;

public class NumerosMenoresIguales25 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Inicializar contadores
        int contador = 0;
        int contadorMenor25 = 0;

        //guardamos los números ingresados en una lista
        int[] numeros = new int[20];

        // Bucle para ingresar 20 números
        while (contador < 20) {
            System.out.print("Ingrese el número " + (contador + 1) + ": ");
            numeros[contador] = scanner.nextInt();

            // Verificar si el número es menor o igual a 25
            if (numeros[contador] <= 25) {
                contadorMenor25++;
            }

            contador++;
        }

        // Mostrar los números menores o iguales a 25
        System.out.println("Números menores o iguales a 25:");
        for (int i = 0; i < contador; i++) {
            if (numeros[i] <= 25) {
                System.out.println(numeros[i]);
            }
        }

        
        scanner.close();
    }
}
