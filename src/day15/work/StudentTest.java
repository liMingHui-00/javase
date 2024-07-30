package day15.work;

/**
 * @Author：lmh
 * @Create: 2024-7-15 18:30
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("小红",12,"小学");
        Student student2 = new Student("小米",21,"大学");
        Student student3 = new Student("小明",14,"初中");
        Student student4 = new Student("小强",19,"大学");
        Student student5 = new Student("小宝",30,"研究生");
        Student studentArr[] = {student1,student2,student3,student4,student5};
        for (int i = 0; i < studentArr.length; i++) {
            if (studentArr[i].getAge()<15){
                studentArr[i].setDegree("幼儿园");
            }
        }
        for (int i = 0; i < studentArr.length; i++) {
            studentArr[i].setAge(studentArr[i].getAge()+5);
        }
        for (int i = 0; i < studentArr.length; i++) {
            if (studentArr[i].getAge()<20){
                studentArr[i] = null;
            }
        }
        for (int i = 0; i < studentArr.length; i++) {
            if (studentArr[i]!=null){
                System.out.println(studentArr[i].getName()+"-"+studentArr[i].getAge()+"-"+studentArr[i].getDegree());
            }
        }
    }
}
