package day16;

/**
 * @Author：lmh
 * @Create: 2024-7-16 14:21
 */
public class Dog extends Animal {
    public void lookDoor(){
        System.out.println(getName()+"看门"+getAge());
    }

    public static void main(String[] args) {
    Dog dog= new Dog();
    dog.setAge(5);
    dog.setName("斯派克");
    dog.lookDoor();
    }
}
