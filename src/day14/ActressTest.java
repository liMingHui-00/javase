package day14;

/**
 * @Author：lmh
 * @Create: 2024-7-14 12:53
 */
public class ActressTest {
    public static void main(String[] args) {
         Actress actressArr[] =new Actress[2];
        Actress actress1 = new Actress("波多野结衣",28);
        Actress actress2 = new Actress("马泽利亚",30);
        actressArr[0] = actress1;
        actressArr[1] = actress2;
        int sum = 0;
        for (int i = 0; i < actressArr.length; i++) {
            sum+=actressArr[i].getAge();
        }
        System.out.println(sum/actressArr.length);
    }
}
