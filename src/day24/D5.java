package day24;

public class D5 {
    public static void main(String[] args) {
        System.out.println(fn(10, 20));
    }
    public static int fn(int a,int b) {
        try {
//            return a+b;
        }catch (Exception e){
            System.out.println(e);
            return b;
        }finally {
            return a;
        }
    }
}
