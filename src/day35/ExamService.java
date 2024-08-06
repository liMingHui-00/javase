package day35;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamService {
     List<ExamItem> itemList = new ArrayList();
     String answer[] ;
     Scanner scanner = new Scanner(System.in);
     int count ;

     //     初始化
     public void init(){
          ArrayList<String> arrayList = new ArrayList<>();
          try {
               BufferedReader bufferedReader = new BufferedReader(new FileReader("aa/items.txt"));
//               把读取到的数据放到arrayList中
               String read ;
               while ((read=bufferedReader.readLine())!=null){
//                    去除空白行
                    if (!"".equals(read)){
                         arrayList.add(read);
                    }
               }
               bufferedReader.close();
//               遍历arrayList集合，把其中的每隔6个数据封装成对象，放入到itemList集合
               for (int i = 0; i < arrayList.size(); i+=6) {
                    String title = arrayList.get(i);
                    String optionA = arrayList.get(i+1);
                    String optionB = arrayList.get(i+2);
                    String optionC = arrayList.get(i+3);
                    String optionD = arrayList.get(i+4);
                    String answer1 = arrayList.get(i+5);
                    ExamItem examItem = new ExamItem(title, optionA, optionB, optionC, optionD, answer1);
                    itemList.add(examItem);
                    // 把答案的长度定义
                    answer = new String[itemList.size()];
               }
          } catch (IOException e) {
               throw new RuntimeException(e);
          }
     }
//     开始考试
     public void startExam() throws IOException {
          Welcome();
          init();
//          进入考试
          boolean flag = true;
          while (flag){
               String n = scanner.next();
               if (n.equalsIgnoreCase("n")){

// .遍历itemList集合【for普通循环】，动态获取每一个item对象，展示该对象的相关信息[title optionA optionB optionC optionD ]
                    for (int i = 0; i < itemList.size(); ) {
                         System.out.println(itemList.get(i).getTitle());
                         System.out.println(itemList.get(i).getOptionA());
                         System.out.println(itemList.get(i).getOptionB());
                         System.out.println(itemList.get(i).getOptionC());
                         System.out.println(itemList.get(i).getOptionD());
//                         输入自己选择的答案
                         String chooseAnswer = scanner.next();
                         if (chooseAnswer.equalsIgnoreCase("a")){
//                              选择A
                              answer[i] = chooseAnswer.toUpperCase();
//                              进入下一题
                              i++;
                         }else if (chooseAnswer.equalsIgnoreCase("b")){
                              //                              选择B
                              answer[i] = chooseAnswer.toUpperCase();
//                              进入下一题
                              i++;
                         }else if (chooseAnswer.equalsIgnoreCase("c")){
                              //                              选择c
                              answer[i] = chooseAnswer.toUpperCase();
//                              进入下一题
                              i++;
                         }else if (chooseAnswer.equalsIgnoreCase("d")){
                              //                              选择d
                              answer[i] = chooseAnswer.toUpperCase();
//                              进入下一题
                              i++;
                         } else if (chooseAnswer.equalsIgnoreCase("p")) {
//                              上一题
                              i=i-1;
                         }else if (chooseAnswer.equalsIgnoreCase("n")){
                              //        显示下一题
                              i++;
                         } else if (chooseAnswer.equalsIgnoreCase("f")) {
//                              交卷
                              judgeExam();
                              break;
                         }
                         else {
                              System.out.println("选择有误，请重新选择");
                         }
                         if (i == itemList.size()){
//                              当做到最后一题时i，直接交卷
                              judgeExam();
                         }
                    }

                    save();
                    flag = false;
               }else {
                    System.out.println("输入不正确，请重新输入");
               }
          }
     }
//     评卷
     private void judgeExam() {

//     把自己的答案与标准答案做对比
          for (int i = 0; i < itemList.size(); i++) {
               if (itemList.get(i).getAnswer().equalsIgnoreCase(answer[i])){
//                    如果和标准答案一样则count++
                    count++;
               }
          }
//          根据count 打印分数
          System.out.println("考了"+count+"0分");
     }
//     保存用户答案和成绩的方法
     public void save() throws IOException {
//    把自己的答案写到文件中
          FileOutputStream fileOutputStream = new FileOutputStream("aa/result.txt");
          for (int i = 0; i < answer.length; i++) {
               if (answer[i]!=null){
                    fileOutputStream.write(answer[i].getBytes());
               }
          }
          fileOutputStream.close();
     }
//     打印成绩
     public void printLastExam() throws IOException {
//          FileInputStream fileInputStream = new FileInputStream("aa/Count.txt");
//          int read ;
//          while ((read = fileInputStream.read())!=-1){
//               System.out.println( (char) read+"0分");
//          }
//          fileInputStream.close();
     }
//     打印菜单
     public void printMenu() throws IOException {
          System.out.println("==============");
          System.out.println("1.进入考试");
          System.out.println("2.查看上次考试成绩");
          System.out.println("3.退出系统");
          System.out.println("==============");
          String choose = scanner.next();
          switch (choose){
               case "1":
                    startExam();
                    break;
               case "2":
                    printLastExam();
                    break;
               case "3":
                    System.exit(0);
                    break;
               default:
                    System.out.println("输入有误");
                    break;
          }
     }
//     考试欢迎语
     public void Welcome(){
          System.out.println("-----欢迎进入考试-----");
          System.out.println("使用以下按键进行考试");
          System.out.println("A-D：选择指定答案");
          System.out.println("P：显示上一题");
          System.out.println("N：显示下一题");
          System.out.println("F：交卷");
          System.out.println("请按N键进入考试...");
     }
}
