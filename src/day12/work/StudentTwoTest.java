package day12.work;

/**
 * @Author：lmh
 * @Create: 2024-7-12 19:56
 */
public class StudentTwoTest {
    public static void main(String[] args) {
        StudentTwo[] students = new StudentTwo[5];
        students[0] = new StudentTwo("小红", 12, "小学");
        students[1] = new StudentTwo("小米", 21, "大学");
        students[2] = new StudentTwo("小明", 14, "初中");
        students[3] = new StudentTwo("小强", 19, "大学");
        students[4] = new StudentTwo("小宝", 30, "研究生");
        for (StudentTwo student : students) {
            if (student.age < 15) {
                student.education = "幼儿园";
            }
        }
        for (StudentTwo student : students) {
            student.age += 5;
        }
        StudentTwo[] filteredStudents = new StudentTwo[students.length];
        int index = 0;
        for (StudentTwo student : students) {
            if (student.age >= 20) {
                filteredStudents[index++] = student;
            }
        }
        for (StudentTwo student : filteredStudents) {
            if (student != null) {
                student.printInfo();
            }
        }
        for (int i = 0;i< students.length;i++){

        }
    }
}
