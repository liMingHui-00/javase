package day16.homeWork.work;

/**
 * @Author：lmh
 * @Create: 2024-7-16 20:07
 */
public class IPhone extends Phone{
    public IPhone() {
    }

    public IPhone(String brand) {
        super(brand);
    }
    @Override
    public void playMusic(String s){
        System.out.println(super.getBrand()+"手机正在播放歌曲"+s);
    }
}
