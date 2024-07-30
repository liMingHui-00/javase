package day15.work;

/**
 * @Author：lmh
 * @Create: 2024-7-15 20:37
 */
public class DD1 {
    static  String name;

    public DD1() {
    }
    public DD1(String name) {
        DD1.name=name;
    }

    public static String getName() {
        return name;
    }
//
//    public static void setName(String name) {
//        DD1.name = name;
//    }
    public  void setName(String name) {
        this.name = name;
    }
}
