package Basic_Syntax_Conditional_Statements_and_Loops_Lab_01;

import java.util.Scanner;

public class Theatre_Promotion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int personAge = Integer.parseInt(scanner.nextLine());

        int theatrePrice = 0;

        switch (dayType) {
            case "Weekday":
                if ((personAge >= 0 && personAge <= 18) || (personAge > 64 && personAge <= 122)) {
                    theatrePrice = 12;
                } else if (personAge > 18 && personAge <= 64) {
                    theatrePrice = 18;
                }
                break;
            case "Weekend":
                if ((personAge >= 0 && personAge <= 18) || (personAge > 64 && personAge <= 122)) {
                    theatrePrice = 15;
                } else if (personAge > 18 && personAge <= 64) {
                    theatrePrice = 20;
                }
                break;
            case "Holiday":
                if (personAge >= 0 && personAge <= 18) {
                    theatrePrice = 5;
                } else if (personAge > 18 && personAge <= 64) {
                    theatrePrice = 12;
                } else if (personAge > 64 && personAge <= 122) {
                    theatrePrice = 10;
                }
                break;
        }
        if (theatrePrice != 0) {
            System.out.printf("%d$", theatrePrice);
        } else {
            System.out.println("Error!");
        }

    }
}
