package day12.work;

/**
 * @Author：lmh
 * @Create: 2024-7-12 19:39
 */
public class ComputerTest {
    public static void main(String[] args) {
        Computer computer1 = new Computer("ThinkPad",7399);
        Computer computer2 = new Computer("Acer",5399);
        computer1.coding("java");
        computer2.playGame("王者荣耀");
    }
}
