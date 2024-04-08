import java.util.Scanner;
public class App {
    public static void main(String[] args) {
       mostrarMenu();
    }
      public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        // Preguntar el nombre y la edad
        System.out.println("Por favor, introduce tu nombre:");
        String nombre = scanner.nextLine();

        // Preguntar el sexo
        System.out.println("¿Cuál es tu sexo? (Hombre/Mujer)");
        String sexo = scanner.nextLine();

        // Preguntar el objetivo
        System.out.println("¿Cuál es tu objetivo? (Ganar masa/Perder peso)");
        String objetivo = scanner.nextLine();

        // Preguntar el nivel de intensidad del objetivo
        System.out.println("¿Quieres lograrlo en un nivel (mucho/poco/intermedio)?");
        String intensidad = scanner.nextLine();

        // Preguntar si es vegetariano o no
        System.out.println("¿Eres vegetariano? (si/no)");
        String esVegetariano = scanner.nextLine();

        // Imprimir los datos recogidos de manera estética
        System.out.println("\n===== RESUMEN DE TU PERFIL =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        System.out.println("Objetivo: " + objetivo + " - Intensidad: " + intensidad);
        System.out.println("Vegetariano: " + esVegetariano);
    }  
}

