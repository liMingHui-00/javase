package day18;

public class LambdaTest {
    public static void main(String[] args) {
        Lambda lambda = new LambdaSon();
        lambda.lambda();
//        匿名内部类
        Lambda lambda2 = new Lambda() {
            @Override
            public void lambda() {
                System.out.println("匿名内部类重写的方法");
            }
        };
        lambda2.lambda();
//        lambda
        Lambda lambda3 = ()->{
            System.out.println("lambda");
        };
        lambda3.lambda();
    }
}
