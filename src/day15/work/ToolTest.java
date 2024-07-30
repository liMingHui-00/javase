package day15.work;

/**
 * @Author：lmh
 * @Create: 2024-7-15 19:53
 */
public class ToolTest {
    public static void main(String[] args) {
//        判断偶数
        Tool.tool(5);
//      传入一个（double）数组，返回升序后的结果
        double a[] = {1.1,5.3,1.6,4.8,9.9};
        Tool.tool(a);
//传入一个（int）数组，返回数组的数据之和
        int b[] = {5,6,9,1,4};
        Tool.tool(b);
//传入两个整数数据，打印a--b之间的和
        Tool.tool(7,10);
//传入两个数组，返回两个数组的合并
        int c[] = {1,2,3,4};
        Tool.tool(b,c);
//定义无参的方法，打印九九乘法表
        Tool.tool();
    }
}
