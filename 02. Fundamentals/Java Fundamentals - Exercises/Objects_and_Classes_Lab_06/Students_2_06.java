package Objects_and_Classes_Lab_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Students_2_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Student> students = new ArrayList<>();

        while (!input.equals("end")) {
            String[] data = input.split(" ");

            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String hometown = data[3];

            if (IsStudentExisting(students, firstName, lastName)) {
                Student student = GetStudent(students, firstName, lastName);

                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHometown(hometown);
            } else {
                Student student = new Student(firstName, lastName, age, hometown);
                students.add(student);
            }

            input = scanner.nextLine();
        }
        String city = scanner.nextLine();
        List<Student> filterStudents = students.stream().filter(e -> e.getHometown().equals(city))
                .collect(Collectors.toList());

        for (Student student : filterStudents) {
            System.out.printf("%s %s is %d years old.\n",student.getFirstName(), student.getLastName(), student.getAge());
        }
    }
    private static boolean IsStudentExisting(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName))
                return true;
        }
        return false;
    }
    private static Student GetStudent(List<Student> students, String firstName, String lastName) {
        Student existingStudent = null;

        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
            }
        }
        return existingStudent;
    }
}