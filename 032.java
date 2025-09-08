public class Demo {
    public static void main(String[] args) {
        Person person = new Person("Bob", true);
        System.out.println(person.getName());
        // Bob
        System.out.println(person.isStudent());
        // true
        person.setStudent(false); // Graduation!
        System.out.println(person.isStudent());
        // false
    }
}