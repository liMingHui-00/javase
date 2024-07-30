package day6;

public class D1 {
    public static void main(String[] args) {
        int height = 8844330;
        double page = 0.1;
        int i = 1;
        while (page<height) {
        page=2*page;
        i++;
        }
        System.out.println(i);
    }
}
