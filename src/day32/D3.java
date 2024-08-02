package day32;

public class D3 {
    static Thread thread1 =new Thread("张三"){
        @Override
        public void run() {
            for (int i = 0; i < 200; i++) {
                System.out.println(getName()+"扫地");
            }

        }
    };
    static Thread thread2 = new Thread("李四"){
        @Override
        public void run() {
            for (int i = 0; i < 180; i++) {
                System.out.println(getName()+"窗玻璃");
            }

        }
    };
    static Thread thread3 = new Thread("王五"){
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(getName()+"烧水");
            }

        }
    };
    static Thread thread4 = new Thread("赵六"){
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(getName()+"查黑帮");
            }
        }
    };

    public static void main(String[] args) {
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
