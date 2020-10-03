package Objects_and_Classes_Exercise_06.Students_05;

public class Student {
    private String firstName;
    private String lastName;
    private Double grade;

    public Student(String firstName, String lastName, Double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %.2f",
                this.getFirstName(),
                this.getLastName(),
                this.getGrade()
                );
    }
}
