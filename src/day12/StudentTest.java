package day12;

/**
 * @Author：lmh
 * @Create: 2024-7-12 14:18
 */
public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name="孙悟空";
        stu1.age=18;
        stu1.id = 101;
        Student stu2 = new Student();
        stu2.name="猪八戒";
        stu2.age = 28;
        stu2.id=102;
//        Student stu3 = new Student(22,"沙和尚");
//        System.out.println(stu3.name);
        Student stuArr[] ={stu1,stu2};
        for (int i = 0; i < stuArr.length; i++) {
            if (stuArr[i].name=="孙悟空"){
                System.out.println(stuArr[i].id+" "+stuArr[i].name+" "+stuArr[i].age);
            }
        }
    }
}
