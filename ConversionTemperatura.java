import java.util.Scanner;

public class ConversionTemperatura {

    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar la temperatura en grados Celsius
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        // Calcular la temperatura en grados Fahrenheit
        double temperaturaFahrenheit = (9.0 / 5.0) * temperaturaCelsius + 32;

        // Mostrar el resultado
        System.out.println("La temperatura en grados Fahrenheit es: " + temperaturaFahrenheit + " °F");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

