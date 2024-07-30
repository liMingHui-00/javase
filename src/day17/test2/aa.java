package day17.test2;

/**
 * @Author：lmh
 * @Create: 2024-7-17 17:48
 */
public interface aa {
    int a = 0;
    void bb();
    default void cc(){
        System.out.println("默认方法");
    }
    static void dd(){
        System.out.println("静态方法");
    }
}
