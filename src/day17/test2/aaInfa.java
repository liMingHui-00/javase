package day17.test2;

/**
 * @Author：lmh
 * @Create: 2024-7-17 18:06
 */
public class aaInfa implements aa{
    @Override
    public void bb() {
        System.out.println("重写");
    }

    @Override
    public void cc() {
        aa.super.cc();
    }
}
