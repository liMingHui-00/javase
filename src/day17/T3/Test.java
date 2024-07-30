package day17.T3;

/**
 * @Author：lmh
 * @Create: 2024-7-17 19:07
 */
public class Test {
    public static void main(String[] args) {
        IPhone phone = new IPhone("华为");
        Song song = new Song("jay","菊花残");
        phone.btFunction();
        phone.connecting();
        phone.playMusic(song);
    }
}
