package day29;

import java.io.File;

public class D2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\李明辉\\Desktop\\aa\\bb\\cc\\新建文件夹.txt");
        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
//        file.mkdirs(); 创建一级或者多级目录
//        file.mkdir() 只能创建一级目录
        System.out.println(file.getName());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.length());
        System.out.println(file.delete());
    }
}
