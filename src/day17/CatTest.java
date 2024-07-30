package day17;

/**
 * @Author：lmh
 * @Create: 2024-7-17 10:48
 */
public class CatTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name="tom";
        cat.eat();
        cat.color="黑色";
        cat.sleep();
        Animal animal = cat;
//        System.out.println(animal==cat);  true
        animal.eat();
        animal.name="m";
        cat.eat();
       /* Animal animal1 = new Animal();
       向下转型前  必须先向上转型
      Cat cat1 =(Cat) animal1;*/
        Cat cat1 = new Cat();
        Animal animal1 = cat1;
        Animal animal2 = new Animal();
    }
}
