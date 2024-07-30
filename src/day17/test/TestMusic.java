package day17.test;

/**
 * @Author：lmh
 * @Create: 2024-7-17 11:43
 */
public class TestMusic {
    public static void main(String[] args) {
        ChinaMusic chinaMusic = new ChinaMusic("暗号");
        OtherMusic otherMusic = new OtherMusic();
        Music musicArr[] = {chinaMusic,otherMusic};
        for (Music music:musicArr){
            music.song();
        }
    }
}
