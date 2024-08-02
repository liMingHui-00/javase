package day31;

public class D77 {
    public static void main(String[] args) throws InterruptedException {
        D7 t1 = new D7("窗口一");
        t1.setPriority(D7.MAX_PRIORITY);
        D7 t2 = new D7();
        t2.setPriority(D7.MIN_PRIORITY);
        D7.sleep(1000);
        t1.start();
        t2.start();

//        System.out.println(t1.getName());
//        System.out.println(t2.getId());
//        System.out.println(t2.getState());
//        System.out.println(t1.getState());

    }
}
