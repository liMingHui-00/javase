package day17.T7;

/**
 * @Author：lmh
 * @Create: 2024-7-17 19:51
 */
public interface Bluetooth {
    void btFunction();
     default void connecting(){
        System.out.println("可以连接WiFi");
    }
}
