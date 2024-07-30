package day19.work;

public class D1 {
    public static void main(String[] args) {
        String s= "Hello-World";
        System.out.println("判断字符串s,与字符串World是否相等"+s=="World");
        String s1 ="Wo";
        System.out.println("用程序得到字符串Wo,在字符串s中的起始索引"+s.indexOf(s1));
        System.out.println("字符串3号索引上的字符为"+s.charAt(3));
        System.out.println("字符串的长度为："+s.length());
        String s2;
        s2=s.replace("o","*");
        System.out.println("把字符串中的o变成*："+s2);
        String s3 = s.replace("-","");
        System.out.println("去掉中划线："+s3);
        System.out.println("打印最后一个o的下标："+s.lastIndexOf("o"));
    }
}
