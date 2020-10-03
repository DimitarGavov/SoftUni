package Objects_and_Classes_Exercise_06.Order_by_Age_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String input = "";
        List<Person> people = new ArrayList<>();

        while (!"End".equals(input = reader.readLine())) {
            String[] data = input.split("\\s+");

            String name = data[0];
            int id = Integer.parseInt(data[1]);
            int age = Integer.parseInt(data[2]);

            Person person = new Person(name, id, age);
            people.add(person);
        }

        people
                .stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .forEach(System.out::println);
    }
}
