package Basic_Syntax_Conditional_Statements_and_Loops_Exercise_01;

import java.util.Scanner;

public class Padawan_Equipment_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsaber_price = Double.parseDouble(scanner.nextLine());
        double robe_price = Double.parseDouble(scanner.nextLine());
        double belt_price = Double.parseDouble(scanner.nextLine());

        double lightsabers = Math.ceil(students * 1.1) * lightsaber_price;
        double robes = robe_price * students;
        double belts = belt_price * (students - (students / 6));

        double sum = lightsabers + robes + belts;

        if (sum <= money) {
            System.out.printf("The money is enough - it would cost %.2flv.", sum);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", sum - money);
        }
    }
}
