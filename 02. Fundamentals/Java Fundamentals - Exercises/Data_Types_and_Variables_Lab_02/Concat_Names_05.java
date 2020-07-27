package Data_Types_and_Variables_Lab_02;

import java.util.Scanner;

public class Concat_Names_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first_name = scanner.nextLine();
        String last_name = scanner.nextLine();
        String delimiter = scanner.nextLine();

        String concat_names = (new StringBuilder()).append(first_name).append(delimiter).append(last_name).toString();

        System.out.println(concat_names);

    }
}
