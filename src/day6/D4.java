package day6;

public class D4 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            System.out.println(i);  if (i == 3) {
//                结束本次循环，结束的是下面的代码，上面的代码仍然会执行
                continue;
            }
        }
    }
}
