package day17.T4;

/**
 * @Author：lmh
 * @Create: 2024-7-17 19:12
 */
public class IPhone extends Phone{
    public IPhone() {
    }

    public IPhone(String brand) {
        super(brand);
    }

    @Override
    public void playMusic(String s) {
        System.out.println(getBrand()+"手机正在播放歌曲"+s);
    }
}
