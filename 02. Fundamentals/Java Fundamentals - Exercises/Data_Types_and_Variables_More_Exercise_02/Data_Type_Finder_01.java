package Data_Types_and_Variables_More_Exercise_02;

import java.util.Scanner;

public class Data_Type_Finder_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";

        while (!"END".equals(input = scanner.nextLine())) {

            boolean isInt = true;
            boolean isFloat = true;

            try {
                Integer.parseInt(input);
            } catch (NumberFormatException e) {
                isInt = false;
            }

            try {
                Double.parseDouble(input);
            } catch (NumberFormatException e){
                isFloat = false;
            }

            if (isInt){
                System.out.printf("%s is integer type%n",input);
            } else if (isFloat){
                System.out.printf("%s is floating point type%n",input);
            } else if (input.length() == 1){
                System.out.printf("%s is character type%n",input);
            } else if (input.equalsIgnoreCase("true") || (input.equalsIgnoreCase("false"))){
                System.out.printf("%s is boolean type%n",input);
            } else {
                System.out.printf("%s is string type%n",input);
            }
        }
    }
}
