package Data_Types_and_Variables_Lab_02;

import java.util.Scanner;

public class Refactor_Volume_of_Pyramid_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Length: ");
        double m = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        double n = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        double h = Double.parseDouble(scanner.nextLine());
        double volume = (m * n * h) / 3;
        System.out.printf("Pyramid Volume: %.2f", volume);
    }
}
