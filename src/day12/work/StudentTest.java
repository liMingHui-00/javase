package day12.work;

/**
 * @Author：lmh
 * @Create: 2024-7-12 19:16
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("小红", 12, "小学");
        Student student2 = new Student("小米", 21, "大学");
        Student student3 = new Student("小明", 14, "初中");
        Student studentArr[] = {student1, student2, student3};
        for (int i = 0; i < studentArr.length; i++) {
            if (studentArr[i].age < 15) {
                studentArr[i].degree = "幼儿园";
            }
        }
        for (int i = 0; i < studentArr.length; i++) {
            System.out.println(studentArr[i].name + "--" + studentArr[i].age + "--" + studentArr[i].degree);
        }
    }
}

