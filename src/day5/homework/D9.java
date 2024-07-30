package day5.homework;

public class D9 {
    public static void main(String[] args) {

        for (int g = 0; g<=20;g++){
         for (int m = 0;m<=33;m++){
            int x = 100 -g-m;
            if (x%3==0){
                int mon = g*5+3*m+x/3;
                if (mon==100){
                    System.out.println("公鸡："+g+"母鸡："+m+"小鸡："+x);
                }
            }
         }
        }
    }
}
