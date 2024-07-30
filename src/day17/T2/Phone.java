package day17.T2;

/**
 * @Author：lmh
 * @Create: 2024-7-17 18:54
 */
public abstract class Phone {
    public void call(){
        System.out.println("打电话");
    }
    public void sendMessage(){
        System.out.println("发短信");
    }
    public abstract void playGame();
}
