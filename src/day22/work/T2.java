package day22.work;

public class T2 {
    public static void main(String[] args) {
                String s[] = {"性","色情","爆炸","恐怖","枪"};
                String mess = "提供用性于定义和恐怖执行与二维几何相关的性对象爆炸的操作的Java 2D类。";
                for(String ms : s){
                    // 使用for循环来实现* 的个数
                    StringBuffer sb = new StringBuffer();
                    for(int i=0;i<ms.length();i++){
                        sb.append("*");
                    }
                    // 替代的语句与敏感的词汇的个数保持一致
                    mess = mess.replace(ms,sb);
                }
                System.out.println(mess);
     }
}



