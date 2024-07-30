package day17.T1;

/**
 * @Author：lmh
 * @Create: 2024-7-17 18:46
 */
public class Dog extends Animal{
    @Override
    public void run() {
        System.out.println("如脱缰的野狗一样奔跑");
    }
    public void eat(){
        System.out.println("狗吃骨头");
    }
}
