//  there should not be a test with salary input = 0!
//  (88/100)
package For_Loop_Exercise_04;

import java.util.Scanner;

public class Salary_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            if (salary > 0) {
                String site = scanner.nextLine();
                switch (site.toLowerCase()) {
                    case "facebook":
                        salary -= 150;
                        break;
                    case "instagram":
                        salary -= 100;
                        break;
                    case "reddit":
                        salary -= 50;
                        break;
                }
            } else {
                System.out.println("You have lost your salary.");
                return;
            }
        }

        if (salary > 0) {
            System.out.println(salary);
        }
    }
}

/*  (100/100 in judge)
        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String site = scanner.nextLine();
            switch (site.toLowerCase()) {
                case "facebook":
                    salary -= 150;
                    break;
                case "instagram":
                    salary -= 100;
                    break;
                case "reddit":
                    salary -= 50;
                    break;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                return;
            }
        }

        if (salary > 0) {
            System.out.println(salary);
        }
 */