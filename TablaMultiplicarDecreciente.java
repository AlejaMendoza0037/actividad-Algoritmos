import java.util.Scanner;
//10.	Realizar un algoritmo que muestre por pantalla la tabla 
//de multiplicar decreciente de cualquier número, ingresado entre el 1 y el 10. 

public class TablaMultiplicarDecreciente {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese un número entre 1 y 10: ");
        int numero = scanner.nextInt();

        // Verificar que el número esté en el rango permitido
        if (numero < 1 || numero > 10) {
            System.out.println("Error: El número ingresado no está en el rango permitido.");
            
            scanner.close();
            return;
        }

        
        int contador = 10;

        // Bucle para mostrar la tabla de multiplicar decreciente
        while (contador >= 1) {
            int resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);
            contador--;
        }

        
        scanner.close();
    }
}
