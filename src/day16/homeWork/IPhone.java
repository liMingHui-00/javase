package day16.homeWork;

/**
 * @Author：lmh
 * @Create: 2024-7-16 19:48
 */
public class IPhone extends Phone{
    @Override
    public void sendMessage(){
        System.out.println("发彩信");
    }
    @Override
    public void playGame(){
        System.out.println("打王者荣耀");
    }
    public void siri(){
        System.out.println("我是小艺");
    }
}
