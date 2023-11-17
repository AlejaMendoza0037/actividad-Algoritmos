import java.util.Scanner;

public class CalculoNotaAnalisis {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Solicitamos las notas de los talleres y el quiz
        System.out.print("Ingrese la nota del Taller 1: ");
        double nota_Taller1 = scanner.nextDouble();

        System.out.print("Ingrese la nota del Taller 2: ");
        double nota_Taller2 = scanner.nextDouble();

        System.out.print("Ingrese la nota del Quiz: ");
        double nota_Quiz = scanner.nextDouble();

        // Calcular la nota total (30% de talleres y quiz + 70% de examen parcial)
        double nota_Total = 0.3 * (nota_Taller1 + nota_Taller2 + nota_Quiz);

        // Solicitar al usuario ingresar la nota del examen parcial
        System.out.print("Ingrese la nota del Examen Parcial: ");
        double notaExamenParcial = scanner.nextDouble();

        // Actualizar la nota total con el 70% del examen parcial
        nota_Total += 0.7 * notaExamenParcial;

        
        System.out.println("La nota total es: " + nota_Total);

        
        scanner.close();
    }
}
