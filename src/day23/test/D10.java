package day23.test;

import java.text.DecimalFormat;

public class D10 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        double d = 123456789.1234555565;
        System.out.println(df.format(d));
        double dd = 0.55;
//        DecimalFormat ddf = new DecimalFormat("0\u2030");
        DecimalFormat ddf = new DecimalFormat("0%");
        System.out.println(ddf.format(dd));
    }
}
