package day17.T7;

/**
 * @Author：lmh
 * @Create: 2024-7-17 20:01
 */
public class Test {
    public static void main(String[] args) {
        IPhone phone = new IPhone("华为");
        Song song = new Song("jay", "暗号");
        phone.btFunction();
        phone.connecting();
        phone.playMusic(song);
    }
}
