package day36;

public class D1 {
    public static void main(String[] args) {
//        String arr[] = {"q", "w", "e", "r"};
//        String s = Arrays.toString(arr);
//        System.out.println(s.charAt(0));
//        for (int i  = s.length()-1; i >= 0; i--) {
//            System.out.print(s.charAt(i));
//        }
//        String str = "abc";
//        String str2 = "a"+"b"+"c";
//        System.out.println(str.equals(str2));
        StringBuilder sb = new StringBuilder();
//        System.out.println(sb.capacity());
//        for (int i = 0; i < 17; i++) {
//            sb.append(i);
//        }
//        System.out.println(sb.capacity());
        for (int i = 0; i < 35; i++) {
            sb.append(i);
        }
        System.out.println(sb.length());
        System.out.println(sb.capacity());
//        String str = "";
//        for (int i = 0; i < arr.length; i++) {
//            if (i == 0) {
//                str = "[" + arr[i];
//            } else if (i <= arr.length - 1) {
//                str = str + "," + arr[i];
//            }
//            if (i == arr.length - 1) {
//                str = str + "]";
//            }
//
//        }
//        System.out.println(str);

    }
}
