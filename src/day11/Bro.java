package day11;

/**
 * @Author：lmh
 * @Create: 2024-7-11 14:24
 */
public class Bro {
    public static void main(String[] args) {
        Book book3 = new Book();
        Book book = book3;
        Book book1 = book3;
        book.msg(50,"兄弟","余华");
        Book book2 = new Book("七龙珠",20,"鸟山明");
        System.out.println(book2.name);
    }
}
