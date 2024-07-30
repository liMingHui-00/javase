package day21;

import java.util.ArrayList;
import java.util.Scanner;

public class D8 {
    public static void main(String[] args) {
        ArrayList<Stu> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
       while (true){
           System.out.println("学生管理系统");
           System.out.println("1：添加学生");
           System.out.println("2：删除学生");
           System.out.println("3：修改学生");
           System.out.println("4：查询学生");
           System.out.println("5：退出");
           System.out.println("请输入你的选择");
           String choose = scanner.next();
           switch (choose){
               case "1":
                   addStudent(list);
                   break;
               case "2":
                   deleteStudent(list);
                   break;
               case "3":
                   updateStudent(list);
                   break;
               case "4":
                   selectStudent(list);
                   break;
               case "5":
                   System.out.println("欢迎下次光临");
//                   停止虚拟机运行
                   System.exit(0);
               default:
                   System.out.println("没有这个选项，请重新输入");
           }
       }
    }
    public static void addStudent( ArrayList<Stu> list ){
        Scanner scanner = new Scanner(System.in);
       while (true){
           System.out.println("请输入学生的id");
           String id = scanner.next();
           if (containId(list,id)) {
               System.out.println("id重复，请重新输入");
           }else {
               System.out.println("请输入学生的姓名");
               String name = scanner.next();
               System.out.println("请输入学生的年龄");
               int age = scanner.nextInt();
               System.out.println("请输入学生的家庭住址");
               String address = scanner.next();
               Stu stu = new Stu(id,name,age,address);
               list.add(stu);
               break;
           }
       }
    }
    public static void deleteStudent(ArrayList<Stu> list){
//        System.out.println("删除学生");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想要删除的学生的id");
        System.out.println("请输入学生的id");
        String id = scanner.next();
        if (containId(list,id)){
//            存在，删除
             list.remove(geuIndex(list, id));
        }else {
            System.out.println("没有找到该学生");
        }
        selectStudent(list);

    }
    public static void updateStudent(ArrayList<Stu> list){
        System.out.println("修改学生");
    }
    public static void selectStudent(ArrayList<Stu> list){
//        System.out.println("查询学生");
        if (list.size()==0){
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            Stu stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }
    public static boolean containId(ArrayList<Stu> list ,String id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)){
//                重复
                return true;
            }
        }
        return false;
    }
    public static int geuIndex(ArrayList<Stu> list ,String id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)){
//                存在
                return i;
            }
        }
//        不存在
        return -1;
    }
}
