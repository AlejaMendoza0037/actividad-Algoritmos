import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalculoEdad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos: fecha de nacimiento
        System.out.print("Ingrese la fecha de nacimiento : ");
        String fecha_Nacimiento = scanner.next();

        // Entrada de datos: fecha actual
        System.out.print("Ingrese la fecha actual : ");
        String fecha_Actual = scanner.next();

        // Convertir las cadenas de fecha a objetos Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fechaNacimiento = dateFormat.parse(fecha_Nacimiento);
            Date fechaActual = dateFormat.parse(fecha_Actual);

            // Calcular la edad
            int edad = calcularEdad(fechaNacimiento, fechaActual);

            // Mostrar la edad
            System.out.println("La edad actual es: " + edad + " años.");
        } catch (ParseException e) {
            System.out.println("Error : Asegúrate de usar el formato correcto (dd/MM/yyyy).");
        }
    }

    // Método para calcular la edad
    private static int calcularEdad(Date fechaNacimiento, Date fechaActual) {
        // Calcular la diferencia en milisegundos
        long diferenciaMillis = fechaActual.getTime() - fechaNacimiento.getTime();

        // Convertir la diferencia a años
        int edad = (int) (diferenciaMillis / (365.25 * 24 * 60 * 60 * 1000));

        return edad;
    }
}


