package day17.test;

/**
 * @Author：lmh
 * @Create: 2024-7-17 11:40
 */
public class ChinaMusic extends Music{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChinaMusic() {
    }

    public ChinaMusic(String name) {
        this.name = name;
    }
    @Override
    public void song(){
        System.out.println(getName()+"华语才是最屌的");
    }
}
