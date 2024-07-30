package day5.pm;

public class D10 {
        public static void main(String[] args) {
            int sum = 0;
            // 外层循环用于计算每个阶乘
            for (int i = 1; i <= 10; i++) {
                int factorial = 1;
                // 内层循环用于计算i的阶乘
                for (int j = 1; j <= i; j++) {
                    factorial *= j;
                }
                // 将阶乘值累加到总和中
                sum += factorial;
            }
            // 输出结果
            System.out.println("1! + 2! + 3! + ... + 10! 的和是：" + sum);
        }
    }

