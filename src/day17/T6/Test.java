package day17.T6;

/**
 * @Author：lmh
 * @Create: 2024-7-17 19:29
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student("关晓彤", 15);
        Phone phone = new Phone("华为手机",1999);
        Study study = new Study();
        Learn learn = study;
        student.studying(learn,phone);
    }
}
