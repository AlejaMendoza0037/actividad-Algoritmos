
import java.util.Scanner;


public class AnoBisiesto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos: año a verificar
        System.out.print("Ingrese un año para verificar si es bisiesto: ");
        int year = scanner.nextInt();

        // Verificar si el año es bisiesto
        if (esBisiesto(year)) {
            System.out.println(year + " es un año bisiesto.");
        } else {
            System.out.println(year + " no es un año bisiesto.");
        }
    }

    // Método para verificar si un año es bisiesto
    private static boolean esBisiesto(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}

