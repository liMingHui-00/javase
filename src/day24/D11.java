package day24;

public class D11 {
        public static void main(String[] args) {
            char ch1 = 'A'; // 单个字符，占用2个字节
            char ch2 = '\u263A'; // Unicode编码的字符，表示一个笑脸
            char ch3 = 97; // 使用ASCII码表示字符 'a'

            System.out.println("ch1: " + ch1);
            System.out.println("ch2: " + ch2);
            System.out.println("ch3: " + ch3);

            // 处理代理对的例子
            String surrogatePair = "\uD83D\uDE00"; // Unicode字符 😀 (U+1F600)
            System.out.println("Surrogate Pair: " + surrogatePair);
            System.out.println("Length of surrogatePair: " + surrogatePair.length()); // 长度为2，因为它是一个代理对
        }

}
