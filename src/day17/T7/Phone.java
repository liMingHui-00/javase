package day17.T7;


/**
 * @Author：lmh
 * @Create: 2024-7-17 19:53
 */
public abstract class Phone implements Bluetooth {
    private String name;
    public abstract void playMusic(Song song );
    public Phone() {}
    public Phone(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
