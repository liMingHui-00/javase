package day11.work;

/**
 * @Author：lmh
 * @Create: 2024-7-11 19:10
 */
public class Person {
    String name;
    double age;
    public String ageMax(Person p1,Person p2){
        if (p1.age>p2.age){
            return p1.name+"年龄大";
        }else {
            return p2.name+"年龄大";
        }
    }
}
