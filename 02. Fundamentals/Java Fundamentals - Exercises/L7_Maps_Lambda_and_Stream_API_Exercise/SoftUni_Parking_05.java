package Maps_Lambda_and_Stream_API_Exercise_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class SoftUni_Parking_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        LinkedHashMap<String, String> registerCars = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split("\\s+");

            String status = input[0];
            String userName = input[1];
            if (status.equals("register")) {
                String licensePlateNumber = input[2];
                if (!registerCars.containsKey(userName)) {
                    registerCars.put(userName, licensePlateNumber);
                    System.out.println(String.format("%s registered %s successfully", userName, licensePlateNumber));
                } else {
                    System.out.println(String.format("ERROR: already registered with plate number %s", licensePlateNumber));
                }
            } else {
                if (!registerCars.containsKey(userName)) {
                    System.out.println(String.format("ERROR: user %s not found", userName));
                } else {
                    System.out.println(String.format("%s unregistered successfully", userName));
                    registerCars.remove(userName);
                }
            }
        }
        registerCars.forEach((key, value) -> System.out.println(String.format("%s => %s", key, value)));
    }
}
