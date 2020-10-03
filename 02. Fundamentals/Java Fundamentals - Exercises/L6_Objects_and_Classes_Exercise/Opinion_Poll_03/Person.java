package Objects_and_Classes_Exercise_06.Opinion_Poll_03;

public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("%s - %d",
                this.getName(),
                this.getAge()
        );
    }

}
