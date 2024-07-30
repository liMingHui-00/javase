package day18;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book() {
            @Override
            public void type() {
                System.out.println("真好看");
            }
        };
        book.type();
    }
}
