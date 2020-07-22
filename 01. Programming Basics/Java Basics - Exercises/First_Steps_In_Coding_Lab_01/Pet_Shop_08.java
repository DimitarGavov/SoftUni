package First_Steps_In_Coding_Lab_01;

import java.util.Scanner;

public class Pet_Shop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogs_count = Integer.parseInt(scanner.nextLine());
        int other_animals_count = Integer.parseInt(scanner.nextLine());

        double sum = dogs_count * 2.5 + other_animals_count * 4;

        System.out.printf("%.2f lv.", sum);
    }
}
