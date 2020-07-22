package For_Loop_Exercise_04;

import java.util.Scanner;

public class Half_Sum_Element_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n ; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;

            if (num > max){
                max = num;
            }
        }
        sum -= max;

        if (sum == max){
            System.out.printf("Yes%nSum = %d", sum);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(max - sum));
        }
    }
}
