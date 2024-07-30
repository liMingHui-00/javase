package day14;

/**
 * @Author：lmh
 * @Create: 2024-7-14 16:07
 */
public class D4 {
    public static void main(String[] args) {
        String str = "qwertyuiSHJHGFGHJDJo4465445115p";
        int smallCase =0;
        int bigCase = 0;
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='a'&&str.charAt(i)<='z'){
                smallCase++;
            } else if (str.charAt(i)>='A'&&str.charAt(i)<='Z') {
                bigCase++;
            } else if (str.charAt(i)>='0'&&str.charAt(i)<='9') {
                num++;
            }
        }
        System.out.println(smallCase);
        System.out.println(bigCase);
        System.out.println(num);
    }
}
