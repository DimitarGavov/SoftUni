package First_Steps_In_Coding_Exercise_01;

import java.util.Scanner;

public class Vacation_Books_List_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int page_hour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int result = pages / page_hour / days;

        System.out.println(result);
    }
}
