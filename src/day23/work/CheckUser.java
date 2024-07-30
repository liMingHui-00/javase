package day23.work;

public class CheckUser {
    public static boolean userOk(String username){
//        username长度大于等于6
        if (username.length()>=6){
//             只能包含数字字母
            int count = 0;
            for (int i = 0; i < username.length(); i++) {
                if (Character.isLetterOrDigit(username.charAt(i))){
//                    if (username.equals("zhangsan")){
//                        return true;
//                    }
                    count++;
                }
            }
            if (count==username.length()){
                return  true;
            }else {
                System.out.println("用户名不符合规范");
                return false;
            }
        }
        System.out.println("用户名不符合规范");
        return false;
    }
    public static boolean pwdOk(String password){
//        长度等于6
        if (password.length()==6){
//             只能包含数字字母
            int count = 0;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))){
//                    if (password.equals("123456")){
//                        return true;
//                    }
                    count++;
                }
            }
            if (count==password.length()){
                return true;
            }else {
                System.out.println("密码不符合规范");
                return false;
            }
        }
        System.out.println("密码不符合规范");
        return false;
    }
}
