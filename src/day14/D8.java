package day14;

/**
 * @Author：lmh
 * @Create: 2024-7-14 17:00
 */
public class D8 {
    public static void main(String[] args) {
        String talk = "你玩的真好，下次别玩了，cnm";
        String arr[] = {"cnm","tmd","下次别玩了","你"};
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"***");
        }
        System.out.println(talk);
    }
}
