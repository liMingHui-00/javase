package day36;

public class D1 {
    public static void main(String[] args) {
        String arr[] = {"q", "w", "e", "r"};
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                str = "[" + arr[i];
            } else if (i <= arr.length - 1) {
                str = str + "," + arr[i];
            }
            if (i == arr.length - 1) {
                str = str + "]";
            }

        }
        System.out.println(str);

    }
}
