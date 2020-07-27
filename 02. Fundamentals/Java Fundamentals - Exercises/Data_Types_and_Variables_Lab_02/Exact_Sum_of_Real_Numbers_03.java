package Data_Types_and_Variables_Lab_02;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exact_Sum_of_Real_Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);

        for (int i = 0; i < n; i++) {
            BigDecimal num = scanner.nextBigDecimal();
            sum = sum.add(num);
        }
        System.out.println(sum);
    }
}
