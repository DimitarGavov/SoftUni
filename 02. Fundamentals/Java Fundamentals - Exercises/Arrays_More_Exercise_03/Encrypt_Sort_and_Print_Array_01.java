package Arrays_More_Exercise_03;

import java.util.Arrays;
import java.util.Scanner;

public class Encrypt_Sort_and_Print_Array_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNames = Integer.parseInt(scanner.nextLine());
        String[] namesArray = new String[numberOfNames];
        int [] numbOutput = new int[numberOfNames];

        for (int i = 0; i < numberOfNames; i++) {
            namesArray[i] = scanner.nextLine();
        }

        for (int i = 0; i < namesArray.length; i++) {
            String name = namesArray[i];
            int sum = 0;
            for (int j = 0; j < name.length(); j++) {
                if ("aeuoiAEIOU".contains(name.charAt(j) + "")) {
                    sum += (int)name.charAt(j) * name.length();
                } else {
                    sum += (int)name.charAt(j) / name.length();
                }
            }
            numbOutput[i] = sum;
        }
        Arrays.sort(numbOutput);
        for (int i = 0; i < numbOutput.length; i++) {
            System.out.println(numbOutput[i]);
        }
    }
}
