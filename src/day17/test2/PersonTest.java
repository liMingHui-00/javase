package day17.test2;
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("阿三");
        Snack snack = new Snack("🐍",5);
        person.feed(snack);
        Pig pig = new Pig("佩奇");
        Pig pig2 = new Pig();
        person.feed(pig);
    }
}
