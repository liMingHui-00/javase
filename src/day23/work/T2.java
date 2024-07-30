package day23.work;
import java.util.Scanner;
public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean zhFlag = true;
        while (zhFlag){
            System.out.println("请输入账号");
            String zh = scanner.next();
//            检查账号是否合法
            if (CheckUser.userOk(zh)){
//                账号正确 终止外层循环 开始判断密码是否正确
                zhFlag = false;
                boolean mmFlag = true;
                while (mmFlag){
                    System.out.println("请输入密码");
                    String mm = scanner.next();
//                    如果密码正确则登录成功。否则重新输入
                   if ( CheckUser.pwdOk(mm)){
//                       密码正确
                       System.out.println("登录成功");
                       return;
                   }
                }
            }
        }
    }
}
