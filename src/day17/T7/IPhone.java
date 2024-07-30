package day17.T7;

/**
 * @Author：lmh
 * @Create: 2024-7-17 19:57
 */
public class IPhone extends Phone {
    public IPhone() {
    }

    public IPhone(String name) {
        super(name);
    }

    @Override
    public void btFunction() {
        System.out.println("支持WIFI功能");
    }

    @Override
    public void playMusic(Song song) {
        System.out.println(getName()+"手机正在播放"+song.getSinger()+"唱的"+song.getName());
    }
}
