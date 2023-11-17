
    
    //1.	Un corredor de maratón (distancia 42,195 Km) ha recorrido la carrera en 2 horas 25 minutos. 
    //Se desea un algoritmo que calcule el tiempo medio en minutos por kilómetro. 

    import java.util.Scanner;

public class TiempoMedioPorKilometro {

    public static void main(String[] args) {
        //entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar ingresar el tiempo total en minutos
        System.out.print("Ingrese el tiempo total de la maratón en minutos: ");
        double tiempo_Total = scanner.nextDouble();

        // Solicitar distancia en kilómetros
        System.out.print("Ingrese la distancia de la maratón en kilómetros: ");
        double distancia = scanner.nextDouble();

        // Calcular el tiempo medio por kilómetro
        double tiempo_Kilometros = tiempo_Total / distancia;

        // Mostrar el resultado
        System.out.println("El tiempo medio por kilómetro es: " + tiempo_Kilometros + " minutos por kilómetro");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

    

