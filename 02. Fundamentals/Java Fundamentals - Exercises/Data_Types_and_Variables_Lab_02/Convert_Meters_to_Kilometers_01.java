package Data_Types_and_Variables_Lab_02;

import java.util.Scanner;

public class Convert_Meters_to_Kilometers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%.2f", Double.parseDouble(scanner.nextLine()) / 1000);
    }
}
