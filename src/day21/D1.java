package day21;

import java.util.ArrayList;

public class D1 {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
//        增
        stringArrayList.add("1");
        stringArrayList.add("2");
        stringArrayList.add("3");
        stringArrayList.add("4");
//        删除
//        stringArrayList.remove("4");
//        stringArrayList.remove(0);
//        改
//        stringArrayList.set(0,"a");
//        查
//        System.out.println(stringArrayList.get(stringArrayList.size() - 1));
//        System.out.println(stringArrayList);
//        for (int i = 0; i < stringArrayList.size(); i++) {
//            System.out.println(stringArrayList.get(i));
//        }
        int arr[] = {1,2,3,4};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
