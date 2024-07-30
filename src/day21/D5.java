package day21;

import java.util.ArrayList;

public class D5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 0; i <= list.size(); i++) {
            Student s = new Student();
            list.add(s);
           if (list.size()==4){
               break;
           }
        }
        System.out.println(list.size());
    }
}
