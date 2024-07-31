package day29;

import java.io.File;

public class D1 {
    public static void main(String[] args) {

      /*
      File file = new File("文件路径");
      File file = new File("文件对象",文件路径)
      File file = new File("文件路径",文件对象)

      * file.exists()判断文件是否存在
      *
      * */
        File file = new File("C:\\Users\\李明辉\\Desktop\\总结");
        System.out.println(file.exists());
    }
}
