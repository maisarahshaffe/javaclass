public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {

        int maxInt = Integer.MAX_VALUE;
        long maxPlusOne = 2147483647L;
        boolean condition = false;
        System.out.println(maxInt);
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }

    public static void main(String[] args) {
        Person person = new Person("Atok", 17);
        person.displayDetails();
    }
}
