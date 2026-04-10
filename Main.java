import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número positivo (1..99): ");
        int num = scanner.nextInt();

        if (num >= 1 && num <= 9) {
            System.out.println("El número tiene un dígito.");
        } else if (num >= 10 && num <= 99) {
            System.out.println("El número tiene dos dígitos.");
        } else {
            System.out.println("Número fuera de rango.");
        }

        scanner.close();
    }
}