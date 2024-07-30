package day17.T3;

/**
 * @Author：lmh
 * @Create: 2024-7-17 19:01
 */
public abstract class Phone extends Bluetooth{
    private String name;

    public Phone() {
    }

    public Phone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void playMusic(Song song);
}
