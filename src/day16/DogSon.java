package day16;

/**
 * @Author：lmh
 * @Create: 2024-7-16 14:44
 */
public class DogSon extends Dog {
    private String ss ;

    public DogSon() {
    }

    public DogSon(String ss) {
        this.ss = ss;
    }

    public static void main(String[] args) {

        DogSon dogSon = new DogSon();
        dogSon.eat();
        dogSon.setName("二哈");
        dogSon.lookDoor();
    }

    /**
     * 获取
     * @return ss
     */
    public String getSs() {
        return ss;
    }

    /**
     * 设置
     * @param ss
     */
    public void setSs(String ss) {
        this.ss = ss;
    }

    public String toString() {
        return "DogSon{ss = " + ss + "}";
    }
}
