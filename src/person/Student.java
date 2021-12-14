package person;

/**
 * Created by Ada on 25.10.2018.
 */
public class Student extends Person {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Student s1 = new Student();

        p1 = s1; //illegal
    }
}
