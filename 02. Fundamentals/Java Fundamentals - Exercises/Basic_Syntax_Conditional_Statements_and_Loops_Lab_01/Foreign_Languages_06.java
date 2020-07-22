package Basic_Syntax_Conditional_Statements_and_Loops_Lab_01;

import java.util.Scanner;

public class Foreign_Languages_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String aCountry = scanner.nextLine();

        switch (aCountry) {
            case "USA":
            case  "England":
                System.out.println("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
