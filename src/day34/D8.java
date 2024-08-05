package day34;

import java.util.concurrent.Callable;

public class D8 implements Callable {

    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println("---------"+i);
        }
        return "sljkfjs";
    }
}
