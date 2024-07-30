package day25.work;
import java.util.ArrayList;
import java.util.List;

public class T4 {
    public static void main(String[] args) {
        List<String> suits = new ArrayList<>();
        List<String> values = new ArrayList<>();
        List<String> deck = new ArrayList<>();
        suits.add("♣");
        suits.add("♠");
        suits.add("♥");
        suits.add("♦");
        for (int i = 1; i <= 10; i++) {
            values.add(String.valueOf(i));
        }
        values.add("J");
        values.add("Q");
        values.add("K");
        for (String suit : suits) {
            for (String value : values) {
                deck.add(suit + value);
            }
        }
        deck.add("刚子");
        deck.add("🃏");
        for (int i = 0; i < deck.size(); i++) {
            if (i > 0 && i % 9 == 0) {
                System.out.println();
            }
            System.out.print(deck.get(i) + "\t");
        }
    }
}
