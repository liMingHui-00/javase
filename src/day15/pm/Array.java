package day15.pm;
public class Array {
    public  static  void sort(int a[]){
        for (int i = 0; i < a.length - 1; i++) {
            for (int i1 = 0; i1 < a.length - 1 - i; i1++) {
                if (a[i1]<a[i1+1]){
                    int k = a[i1];
                    a[i1] = a[i1+1];
                    a[i1+1] = k;
                }
            }
        }

    }
    public  static  void  DD(int a[]){
        sort(a);
    }

    public static void main(String[] args) {
        int a[] = {55,8,5,6,4,874,68,45,99};
//        Array.sort(a);
        Array.DD(a);
        for (int aa:a){

            System.out.println(aa);
        }
    }

}
