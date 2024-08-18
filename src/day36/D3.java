package day36;

import java.util.ArrayList;

public class D3 {
    public static void main(String[] args) {
        ArrayList<user> list = new ArrayList<>();
        user u1 = new user("1001", "孙悟空", "123456");
        user u2 = new user("1002", "猪八戒", "456779");
        user u3 = new user("1003", "沙悟净", "9999");

        list.add(u1);
        list.add(u2);
        list.add(u3);
        System.out.println(containes(list, "10021"));
    }

    public static boolean containes(ArrayList<user> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (
                    list.get(i).getId().equals(id)

            ) {
                return true;
            }
        }
        return false;
    }
}
