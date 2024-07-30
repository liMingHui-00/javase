package day11;

/**
 * @Author：lmh
 * @Create: 2024-7-11 14:18
 */
public class Book {
    String name;
    int price;
    String author;
    public void msg( int price,String name,String author  ){
        System.out.println(name+"这部书很好看！作者是"+author+"，价格是"+price);
    }

    public Book() {
    }

    public Book(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }
}
