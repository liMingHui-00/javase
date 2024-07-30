package day12;

/**
 * @Author：lmh
 * @Create: 2024-7-12 15:12
 */
public class TiktokTest {
    public static void main(String[] args) {
        Tiktok tiktok1 = new Tiktok();
        tiktok1.author="吸奇侠";
        tiktok1.type = "教父";
        tiktok1.fun = 354;
        Tiktok tiktok2 = new Tiktok("小约翰",999,"奇葩小国");
        Tiktok tiktokArr [] = {tiktok2,tiktok1};
        for ( Tiktok t :tiktokArr){
            System.out.println(t.author+"---"+t.type);
        }

    }
}
