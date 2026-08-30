package app;

public class PersonProfile {

    private static String name;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        PersonProfile person1 = new PersonProfile();
        PersonProfile person2 = new PersonProfile();

        person1.setName("John");

        person2.setName("Kate");

        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}
