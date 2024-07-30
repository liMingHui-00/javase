package day11.work;

/**
 * @Author：lmh
 * @Create: 2024-7-11 19:11
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.name="老王";
        person.age=35;
        Person person1 = new Person();
        person1.name="小芳";
        person1.age=23;
        System.out.println(person1.ageMax(person1, person));
    }
}
