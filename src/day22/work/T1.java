package day22.work;

public class T1 {
    public static void main(String[] args) {
        String arr[] = {"性","色情","爆炸","恐怖","枪"};
        String msg ="蟹性堡王色情规则怪谈合爆炸集，不恐怖要相信红枪色的派大星";
        for (int i = 0; i < arr.length; i++) {
            String count = "";
            for (int j = 0;j<arr[i].length();j++){
                count+="*";
            }
            msg= msg.replace(arr[i],count);
        }
        System.out.println(msg);
    }
}
