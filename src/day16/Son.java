package day16;

/**
 * @Author：lmh
 * @Create: 2024-7-16 15:38
 */
public class Son extends Father {
   public Son(){
       super();
       System.out.println("我是son构造器");
   }

    public static void main(String[] args) {
        Son son = new Son();
    }
}
