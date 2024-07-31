package day29;

import java.io.File;

public class D3 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\李明辉\\Desktop\\新建文件夹 (2)");
        File file1 = new File("C:\\Users\\李明辉\\Desktop\\aa");
        System.out.println(file1.delete());
        String[] fileName = file.list();
//        System.out.println(Arrays.toString(fileName));
        File[] files = file.listFiles();
//        Arrays.stream(files).forEach(System.out::println);
        System.out.println(file.getParent());
    }
}
