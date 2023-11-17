import java.util.Scanner;
//Diseñar un algoritmo que permita ingresar la hora, minutos y segundos, 
//y que calcule la hora en el siguiente segundo ("0<= H <=23", "0<= M <=59" "0<= S<=59")

public class SiguienteSegundo {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la hora (0-23): ");
        int hora = scanner.nextInt();

        if (hora < 0 || hora > 23) {
            System.out.println("Error: La hora ingresada no es válida.");
            
            scanner.close();
            return;
        }

        
        System.out.print("Ingrese los minutos (0-59): ");
        int minutos = scanner.nextInt();

        // Verificamos  la validez de los minutos
        if (minutos < 0 || minutos > 59) {
            System.out.println("Error: Los minutos ingresados no son válidos.");
            
            scanner.close();
            return;
        }

        
        System.out.print("Ingrese los segundos (0-59): ");
        int segundos = scanner.nextInt();

        // Verificamos la validez de los segundos
        if (segundos < 0 || segundos > 59) {
            System.out.println("Error: Los segundos ingresados no son válidos.");
            
            scanner.close();
            return;
        }

        // Incrementamos los segundos
        segundos++;

        // Verificar si es necesario ajustar los minutos y las horas
        if (segundos >= 60) {
            segundos = 0;
            minutos++;

            if (minutos >= 60) {
                minutos = 0;
                hora++;

                if (hora >= 24) {
                    hora = 0;
                }
            }
        }

        
        System.out.println("La nueva hora es: " + hora + ":" + minutos + ":" + segundos);

       
        scanner.close();
    }
}
