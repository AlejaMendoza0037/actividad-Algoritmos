import java.util.Scanner;

public class DuplicarCapital {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario  que ingrese el capital inicial
        System.out.print("Ingrese el capital inicial (C): ");
        double capitalInicial = scanner.nextDouble();

        // Solicitar al usuario ingresar la tasa de interés anual (R)
        System.out.print("Ingrese la tasa de interés anual (R): ");
        double tasaInteresAnual = scanner.nextDouble();

        // contador
        int anos = 0;
     
        while (capitalInicial < 2 * capitalInicial) {
            capitalInicial *= (1 + tasaInteresAnual); // Fórmula de interés compuesto
            anos++;
        }
       
        System.out.println("Se tardará " + anos + " años en duplicar el capital.");

        
        scanner.close();
    }
}
