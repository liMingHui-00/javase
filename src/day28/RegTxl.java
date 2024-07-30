package day28;

import java.util.regex.Pattern;

public class RegTxl {
//    手机号
    public static boolean isValidPhoneNumber(String phoneNumber) {
        if ((phoneNumber != null) && (!phoneNumber.isEmpty())) {
            return Pattern.matches("^1[3-9]\\d{9}$", phoneNumber);
        }
        return false;
    }
//    名字
    public  static  boolean isValidChineseName(String name){
        String regex ="[\\u4e00-\\u9fa5]+";
        return name.matches(regex);
    }

}
