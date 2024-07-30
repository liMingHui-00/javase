package day18;

public class SeasonTest {
    public static void main(String[] args) {
     Season season = Season.xia;
     System.out.println("现在是"+season.getName());
        Season[] seasons = Season.values();
        for (Season s:seasons){
            System.out.println(s.getName());
        }
    }
}
