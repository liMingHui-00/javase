package day27;

public class D4 {
    public static void main(String[] args) {
        Dring dring = new Dring() {
            @Override
            public void dr() {
                System.out.println("lkj");
            }
        };
        Dring dring1 = ()-> System.out.println("weqw");
        dring.dr();
        dring1.dr();
    }

}
