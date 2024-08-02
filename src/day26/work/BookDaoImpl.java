package day26.work;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookDaoImpl implements BookDao{
    boolean flag = true;

    Scanner scanner = new Scanner(System.in);
    @Override
    public void ui() {
      while (flag){
          System.out.println("*******************");
          System.out.println("图书信息管理系统");
          System.out.println("*******************");
          System.out.println("1- 添加图书信息");
          System.out.println("2- 修改图书信息");
          System.out.println("3- 删除图书信息");
          System.out.println("4- 根据编号查询图书信息");
          System.out.println("5- 根据名称模糊查询图书信息");
          System.out.println("6- 根据价格范围查询图书信息");
          System.out.println("7- 查询所有图书信息");
          System.out.println("8- 退出系统");
          System.out.println("*******************");
          System.out.println("请输入你的选择：");
          Scanner scanner = new Scanner(System.in);
          String choose = scanner.next();
          switch (choose){
              case "1":add();break;
              case "2":update();break;
              case "3":delete();break;
              case "4":selectById();break;
              case "5":selectByName();break;
              case "6":selectByPrice();break;
              case "7":selectAll();break;
              case "8":flag = false;break;
              default:
                  System.out.println("输入有误");
                  break;
          }
      }
    }
    public  void toFile(List<Book> list){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aa/book.txt"));
            // 写入对象
            oos.writeObject(list);
            //
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //	2. 定义一个方法，反序列化读取上面的文件并返回List<Student>集合
    public  List<Book> fromFile(){
        try {
            ObjectInputStream oin = new ObjectInputStream(new FileInputStream("aa/book.txt"));
            //
            List<Book> list = (List<Book>) oin.readObject();
            //
            oin.close();
            return list;
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    @Override
    public void add() {
        List<Book> books = fromFile();
        System.out.println("请输入你想要添加的图书信息");
        System.out.println("添加图书的id");
        int id =  scanner.nextInt();
        // 判断该id是否存在
        if (isOnly(id)){
            System.out.println("添加图书的名称");
            String name = scanner.next();
            System.out.println("添加图书的作者");
            String author = scanner.next();
            System.out.println("添加图书的价格");
            int price = scanner.nextInt();
            Book book1 = new Book(id,name,author,price);
                    books.add(book1);
                    System.out.println("添加成功");
            toFile(books);

        }else {
//            id重复  重新录用
            System.out.println("id重复  重新录用");
            add();
        }
    }

    @Override
    public void delete() {
        List<Book> books = fromFile();
//从控制台输入你要删除的图书的编号，遍历集合把该编号的对应的图书信息从数组中删除
        System.out.println("请输入想要删除的图书编号");
        int id = scanner.nextInt();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id){
//                确认删除吗
                System.out.println("你要删除的数据如下");
                System.out.println(books.get(i));
                System.out.println("确认删除吗（y/n）");
                String qs =  scanner.next();
                 if (qs.equalsIgnoreCase("y")){
                     books.remove(books.get(i));
                     System.out.println("删除成功");
                     toFile(books);
                 }else {
                     System.out.println("取消删除");
                 }
            }
        }
    }

    @Override
    public void update() {
        List<Book> books = fromFile();
        System.out.println("请输入你想要修改图书信息的id");
        int id =  scanner.nextInt();
            System.out.println("新的图书的名称");
            String name = scanner.next();
            System.out.println("新的图书的作者");
            String author = scanner.next();
            System.out.println("新的图书的价格");
            int price = scanner.nextInt();
            Book book1 = new Book(id,name,author,price);
            for (int i = 0; i <= books.size(); i++) {
                if (books.get(i).getId()==id){
                   books.add(i,book1);
                   books.remove(i+1);
                    System.out.println("修改成功");
                    toFile(books);
                    break;
                }
            }
    }

    @Override
    public void selectById() {
        List<Book> books = fromFile();
        System.out.println("请输入想要查找的图书编号");
        int id = scanner.nextInt();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id){
                System.out.println(books.get(i));
                return;
            }
        }
        System.out.println("查无此树");
    }

    @Override
    public void selectByName() {
        List<Book> books = fromFile();
        System.out.println("请输入想要查找图书的名称");
        String name = scanner.next();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getName().contains(name)){
                System.out.println(books.get(i));
            }
        }
    }

    @Override
    public void selectByPrice() {
        List<Book> books = fromFile();
        System.out.println("输入价格的最大值");
        int max = scanner.nextInt();
        System.out.println("输入价格的最小值");
        int min = scanner.nextInt();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getPrice()>=min && books.get(i).getPrice()<=max){
                System.out.println(books.get(i));
            }
        }
    }

    @Override
    public void selectAll() {
        List<Book> books = fromFile();
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }

    @Override
    public boolean isOnly(int id) {
        List<Book> books = fromFile();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i)!=null){
//                判断id是否唯一  如果存在就返回false
                if (books.get(i).getId()==id){
                    return false;
                }
            }
        }
        return true;
    }
}
