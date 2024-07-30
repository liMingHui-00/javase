package day19;
public class StringTest {
    public static void main(String[] args) {
        char[] a ={'a','b','c','d'};
        String s = new String(a);
        System.out.println(s.charAt(0));
        System.out.println(s.toUpperCase());
        System.out.println(s.indexOf("c"));
        System.out.println(s.lastIndexOf("a"));
        System.out.println(s.equalsIgnoreCase(s.toUpperCase()));
        String s1 = "41284544454";
        System.out.println(s1.startsWith("41"));
        System.out.println(s1.endsWith("99"));
        System.out.println(s1.concat("55"));
        System.out.println(s1.contains("44"));
//        System.out.println(s1 += s1.replace("4", "**"));
        s1 = s1.replace("4","*");
//        s1 = s1.replace("*","4");
        System.out.println(s1);
        System.out.println(String.join(" ","1","2","a"));
        String s2 = "1 2 3 4 5 6 7 8 9";
        String s3[] = s2.split(" ");
        for (int i = 0; i < s3.length; i++) {
            System.out.println(s3[i]);
        }
    }
}
