package day12;
public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher1  =  new Teacher(11,"tom",5000);
        Teacher teacher2  =  new Teacher(11,"jock",25500);
        Teacher teacher3  =  new Teacher(11,"lily",15500);
        Teacher teacher4  =  new Teacher(11,"tim",8000);

        Teacher teacherArr[] ={teacher1,teacher2,teacher3,teacher4};
        for (Teacher teacher:teacherArr){
            if (teacher.salary>10000){
                teacher.say();
                teacher.teach("java");
            }
        }
    }
}
