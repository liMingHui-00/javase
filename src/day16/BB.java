package day16;

/**
 * @Author：lmh
 * @Create: 2024-7-16 15:16
 */
public class BB extends  AA{
    private String aa="son";
    public void zz(){
        System.out.println(aa);
        System.out.println(super.aa);
    }
    @Override
    public void sss(){
        System.out.println("重写");
    }

    public static void main(String[] args) {
        BB bb = new BB();
        bb.zz();
    }
}
