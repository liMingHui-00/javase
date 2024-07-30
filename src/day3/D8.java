package day3;

public class D8 {
    public static void main(String[] args) {
            /*double a = 123.456;
            double d = 0.456*100;
            double e = d;
            System.out.println(e);
            int b = (int) a;
            System.out.println(b);
            double d = 55.5;
            int i = 10;
            boolean b = d > i;
            String msg =  b ?  "是" : "fou";
            System.out.println(msg);
            double x   = d > i ? d : i;
            System.out.println(x);*/
            int aaa = 45;
            String msg2 = (aaa % 3 ==0) ? aaa +"能":aaa+"不能";
            System.out.println(msg2);
            for (int i = 1; i <=aaa; i++) {
            if (aaa % i ==0 ){
               System.out.println(i);
           }
        }
    }
}
