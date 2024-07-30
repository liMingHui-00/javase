package day24;

public class D2 {
    public static void main(String[] args) {
        try {
//            method();
//            System.out.println(1);
        }catch (StackOverflowError e){
            System.out.println(e);
        }finally {
            System.out.println("不论是否有错误都会执行");
        }
    }
    public static void method(){
        int a =0;
        method();
    }
}
