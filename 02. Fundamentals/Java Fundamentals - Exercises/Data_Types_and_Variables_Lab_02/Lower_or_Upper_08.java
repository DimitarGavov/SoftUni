package Data_Types_and_Variables_Lab_02;

import java.util.Scanner;

public class Lower_or_Upper_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (Character.isLowerCase(scanner.next().charAt(0))) {
            System.out.println("lower-case");
        } else {
            System.out.println("upper-case");
        }
    }
}
