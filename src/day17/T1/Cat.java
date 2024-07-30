package day17.T1;

/**
 * @Author：lmh
 * @Create: 2024-7-17 18:49
 */
public class Cat extends Animal{
    @Override
    public void run() {
        System.out.println("奔跑的猫毛都被撸秃了");
    }
    public void catMouse(){
        System.out.println("猫抓老鼠");
    }
}
