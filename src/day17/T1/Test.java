package day17.T1;

/**
 * @Author：lmh
 * @Create: 2024-7-17 18:51
 */
public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Animal animal[] = {cat,dog};
        for (Animal animal1:animal){
            if (animal1 instanceof Cat){
                animal1.run();
                ((Cat) animal1).catMouse();
            }
            if (animal1 instanceof Dog){
                animal1.run();
                ((Dog) animal1).eat();
            }
        }
    }
}
