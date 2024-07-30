package day26;

import java.util.Arrays;

public class D12 {
    public static void AA(String ...a){
        // 使用Arrays.toString来打印数组内容
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        D12.AA("555", "666");
    }
}
