package day9;

/**
 * @Author：lmh
 * @Create: 2024-7-9 17:46
 */
public class D12 {
    public static void main(String[] args) {
        String s[] = {"孙悟空", "猪八戒", "沙和尚"};
        String s1[] = {"白骨精", "牛魔王"};
        String s2[] = new String[s.length + s1.length];
        for (int i = 0; i < s.length; i++) {
            s2[i] = s[i];
        }
        for (int i = 0; i < s1.length; i++) {
            s2[s.length + i] = s1[i];
        }
        for (String i : s2) {
            System.out.println(i);
        }
    }
}
