package app;

public class PersonRanking {
    public static void main(String[] args) {
        Person p1 = new Person(25);
        Person p2 = new Person(25);

        System.out.println(p1.compareTo(p2) == 0);
    }

    static class Person implements Comparable<Person> {
        private int age;

        public Person(int age) {
            this.age = age;
        }

        public int compareTo(Person obj) {
            return age > obj.age ? 1 : -1;
        }

    }
}
