package app;

public class ProfileReader {

    static class Person {
        private String name;

        public Person(String name) {
        }

        String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Person person = new Person("John");
        System.out.println(person.getName().length());
    }
}
