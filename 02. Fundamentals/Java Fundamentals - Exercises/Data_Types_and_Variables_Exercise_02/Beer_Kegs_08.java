package Data_Types_and_Variables_Exercise_02;

import java.util.Scanner;

public class Beer_Kegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String biggest_model = "";
        double biggest_volume = -Double.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int h = Integer.parseInt(scanner.nextLine());

            double current_volume = Math.PI * Math.pow(radius, 2) * h;

            if (current_volume > biggest_volume) {
                biggest_volume = current_volume;
                biggest_model = model;
            }
        }

        System.out.println(biggest_model);
    }
}
