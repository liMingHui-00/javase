package day17;

/**
 * @Author：lmh
 * @Create: 2024-7-17 10:47
 */
public class Cat extends Animal{
    String color;
    public void sleep(){
        System.out.println(color+"睡觉");
    }
    @Override
    public void eat(){
        System.out.println(name+"吃饭*********重写");
    }
}
