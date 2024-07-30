package day18.work;

import java.util.Scanner;

public class StudentDaoImpl implements StudentDao{
    Student student[] = new Student[10];
    Scanner scanner = new Scanner(System.in);
    boolean flag = true;
    @Override
    public void ui() {
       while (flag){
           System.out.println("*******************");
           System.out.println("学生信息管理系统");
           System.out.println("*******************");
           System.out.println("1- 添加学生信息");
           System.out.println("2- 修改学生信息");
           System.out.println("3- 删除学生信息");
           System.out.println("4- 查看学生信息");
           System.out.println("5- 退出系统");
           System.out.println("*******************");
           System.out.println("请输入你的选择：");
          int choose = scanner.nextInt();
          switch (choose){
              case 1:
                  add();
                  break;
              case 2:

                  update();
                  break;
              case 3:
                  delete();
                  break;
              case 4:
                  select();
                  break;
              case 5:
                  flag = false;
                  break;
              default:
                  System.out.println("输入有误，请重新输入！");
          }
       }
    }
    @Override
    public void add() {
        System.out.println("请输入学生的id");
        int id = scanner.nextInt();
        System.out.println("请输入学生的姓名");
        String name = scanner.next();
        System.out.println("请输入学生的性别");
        String sex = scanner.next();
        System.out.println("请输入学生的年龄");
        int age = scanner.nextInt();
        for (int i = 0; i < student.length; i++) {
            if (student[i]==null){
                Student student1 = new Student(id,name,sex,age);
                student[i] = student1;
                System.out.println("添加成功");
                break;
            }
        }
    }
    @Override
    public void delete() {
        System.out.println("请输入你想要删除的学生的id");
        boolean b = false;//没有这个人  删除失败
        int id = scanner.nextInt();
        for (int i = 0; i < student.length; i++) {
            if (student[i]!=null){
                if (student[i].getId()==id){
                    student[i] = null;
                    System.out.println("删除成功");
                    b = true;
                    break;
                }
            }
        }
        if (!b){
            System.out.println("查无此人，删除失败");
        }
    }
    @Override
    public void update() {
        System.out.println("请输入要修改的学生的id");
        int id = scanner.nextInt();
        for (int i = 0; i < student.length; i++) {
            if (student[i]!=null&&student[i].getId()==id){
                System.out.println("请输入修改后学生的姓名");
                String nameNew = scanner.next();
                System.out.println("请输入修改后学生的性别");
                String sexNew = scanner.next();
                System.out.println("请输入修改后学生的年龄");
                int ageNew = scanner.nextInt();
                    student[i].setAge(ageNew);
                    student[i].setName(nameNew);
                    student[i].setSex(sexNew);
                    System.out.println("修改成功");
                return;
            }
        }
        System.out.println("查无此人，修改失败");
    }

    @Override
    public void select() {
        for (int i = 0; i < student.length; i++) {
            if (student[i]!=null){
                student[i].show();
            }
        }
    }
}
