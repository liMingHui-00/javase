package day15.work;

/**
 * @Author：lmh
 * @Create: 2024-7-15 19:44
 */
public class Tool {
    public static void tool(int a){
        if (a%2==0){
            System.out.println(a+"是偶数");
        }else {
            System.out.println(a+"不是偶数");
        }
    }
    public static double[] tool(double a[]){
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (j>j+1){
                    double k = a[j];
                    a[j] = a[j+1];
                    a[j+1] = k;
                }
            }
        }
        return a;
    }
    public static int tool(int a[]){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        return sum;
    }
    public static int tool(int a,int b){
        int sum = 0;
        for (int i = a; i < b; i++) {
            sum+=i;
        }
        return sum;
    }
    public static int [] tool(int a[],int b[]){
        int c[] = new int[a.length+b.length];
        for (int i = 0; i < a.length; i++) {
            c[i]= a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length+i] = b[i];
        }
        return c;
    }
    public static void tool(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
