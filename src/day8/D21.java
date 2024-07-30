package day8;

/**
 * @Author：lmh
 * @Create: 2024-7-8 18:29
 */
public class D21 {
    public static void main(String[] args) {
        int i = 9;
        while (i>=1){
            int j = 1;
            do {
                System.out.print(j+"*"+i+"="+i*j+"\t");
                j++;
            }while (j<=i);
            System.out.println();
            i--;
        }

        System.out.println("-------------------------------");
        int x = 9;
        do {
            int y = 1;
            for (int k = 1;k<=9-x;k++){
                System.out.print("\t\t");
            }
            while (y<=x){
                System.out.print(y+"*"+x+"="+x*y+"\t");
                y++;
            }
            System.out.println();
            x--;
        }while (x>=1);

    }
}
