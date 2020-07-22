package Conditional_Statements_Exercise_02;

import java.util.Scanner;

public class Metric_Converter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        String from_unit = scanner.nextLine();
        String to_unit = scanner.nextLine();
        
        double result = 0;

        if (from_unit.equals("mm") & to_unit.equals("m")) {
            result = num / 1000;
        } else if (from_unit.equals("mm") & to_unit.equals("cm")) {
            result = num / 10;
        } else if (from_unit.equals("cm") & to_unit.equals("m")) {
            result = num / 100;
        } else if (from_unit.equals("cm") & to_unit.equals("mm")) {
            result = num * 10;
        } else if (from_unit.equals("m") & to_unit.equals("cm")) {
            result = num * 100;
        } else if (from_unit.equals("m") & to_unit.equals("mm")) {
            result = num * 1000;
        }

        System.out.printf("%.3f", result);
    }
}
