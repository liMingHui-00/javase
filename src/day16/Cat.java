package day16;

/**
 * @Author：lmh
 * @Create: 2024-7-16 14:29
 */
public class Cat extends Animal {
    public void catMouse(){
        System.out.println("抓老鼠");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("汤姆");
        cat.setAge(5);
        cat.catMouse();
        System.out.println(cat.getAge()+" " +cat.getName());
    }
}
