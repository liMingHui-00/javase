package day24;

public class D3 {
    public static void main(String[] args) {
        try {
        String s = null;
            System.out.println(s.length());
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }catch (RuntimeException e){
            System.out.println("运行时异常");
        }catch (Exception e){
            System.out.println("异常");
        }catch (Throwable e){
            System.out.println("最大异常");
        }finally {
            System.out.println("不管有没有异常我都会执行");
        }
    }
}
