package day12;

/**
 * @Author：lmh
 * @Create: 2024-7-12 15:00
 */
public class Tiktok {
    String type;
    int fun;
    String author;

    public Tiktok(String author, int fun, String type) {
        this.author = author;
        this.fun =fun;
        this.type = type;
        System.out.println(this);
    }
    public  Tiktok(){}
}
