package day21;

import java.util.ArrayList;

public class D7 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("苹果", 9999);
        Phone p2 = new Phone("小米", 999);
        Phone p3 = new Phone("华为", 1999);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<Phone> phoneArrayList = getPhone(list);
        for (int i = 0; i < phoneArrayList.size(); i++) {
            System.out.println(phoneArrayList.get(i));

        }
    }
    public static ArrayList<Phone> getPhone(ArrayList<Phone> list ){
        ArrayList<Phone> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone phone = list.get(i);
            if (phone.getPrice()<3000){
               res.add(phone);
            }
        }
        return  res;
    }
}
