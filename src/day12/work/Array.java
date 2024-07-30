package day12.work;

/**
 * @Author：lmh
 * @Create: 2024-7-12 20:03
 */
public class Array {
    public void isOuShu(int num){
        System.out.println(num%2==0?num+"是偶数":num+"不是偶数");
    }
    public double[] jiangXu(double arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]<arr[j+1]){
                    double k =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = k;
                }
            }
        }
        return arr;
    }
    public int sumArr(int arr[]){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public int oneToOne(int a,int b){
        int sum = 0;
        for (int i = a; i <=b ; i++) {
            sum+=i;
        }
        return sum;
    }

    public int [] heBing(int a[],int b[]){
        int c[] =new int[a.length+b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length+i] = b[i];
        }
        return c;
    }
}
