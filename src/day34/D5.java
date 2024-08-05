package day34;

public class D5 {
    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();
        D3 d3 = new D3();
        D4 d4 = new D4();
        d3.b=b;
        d3.a= a;
        d4.a =a ;
        d4.b= b;
        d3.start();
        d4.start();
    }
}
