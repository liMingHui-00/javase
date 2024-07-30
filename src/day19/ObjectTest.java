package day19;

public class ObjectTest {
    public static void main(String[] args) {
        Object o = new Object();
        Object o1 = new Object();
        System.out.println(o.equals(o1));
        System.out.println(o.toString());
        System.out.println(o1.hashCode());
        System.out.println(o.getClass());
        System.out.println(o==o1);
        int a[] ={1,2,2};
        Object object = a;
        System.out.println("**********");
        System.out.println(object.toString());
        System.out.println(object.toString().toString());
        System.out.println(object.toString().equals(object.toString().toString()));//true
        System.out.println(object.toString()==object.toString().toString());//false
        char c[] = {'a','b','c','d','e'};
        String s = new String(c);
        System.out.println(s);
        System.out.println(new String(c, 0, c.length-1));
        System.out.println("****************");
        byte b[] = {69,68,67};
        String bb =new String(b);
            System.out.println(bb);
        System.out.println("-------------");
      int aaa[] = {1,2,3,4};
      int ccc[] =    aaa.clone();
//        System.out.println(aaa==ccc); false
        aaa[0] = 99;
            for (int i = 0; i < ccc.length; i++) {
                System.out.println(ccc[i]);
            }
            String bbb="a";
            String ddd="a";
        System.out.println(bbb==ddd);



    }
}
