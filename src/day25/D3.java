package day25;

public class D3<T> {
    public  void printArray(T[] arr){
        for (T t : arr) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        Integer[] i = {1,2,3,4};
        D3<Integer> d3 = new D3<>();
        d3.printArray(i);
    }
}
