package day4;

public class D12 {
    public static void main(String[] args) {
        char score = 'c';
        switch (score)
        {
            case 'a':
                System.out.println("优秀");
                break;
            case 'b':
                System.out.println("良好");
                break;
            default:
                System.out.println("补考");
                break;
        }
    }
}
