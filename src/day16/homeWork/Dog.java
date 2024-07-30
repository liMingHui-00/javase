package day16.homeWork;

/**
 * @Author：lmh
 * @Create: 2024-7-16 19:40
 */
public class Dog  extends Animal{
    @Override
    public void eat(){
        System.out.println("狗吃狗粮");
    }
    @Override
    public void run(){
        System.out.println("跑的像是脱缰的🐎");
    }
    public void cry(){
        System.out.println("🐕汪汪叫");
    }
}
