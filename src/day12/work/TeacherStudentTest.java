package day12.work;

/**
 * @Author：lmh
 * @Create: 2024-7-12 19:33
 */
public class TeacherStudentTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("李博文", 30, "Java基础中面向对象");
        teacher.eat();
        teacher.teach(teacher.content);
        StudentT student = new StudentT("李四", 18, "面向对象");
        student.eat();
        student.study(student.content);
    }
}

