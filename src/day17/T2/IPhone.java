package day17.T2;

/**
 * @Author：lmh
 * @Create: 2024-7-17 18:55
 */
public class IPhone extends Phone{
    @Override
    public void playGame() {
        System.out.println("打王者荣耀");
    }
    @Override
    public void sendMessage(){
        System.out.println("发彩信");
    }
     public void siri(){
         System.out.println("人工智障");
     }
}
