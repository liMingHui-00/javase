package day14;

/**
 * @Author：lmh
 * @Create: 2024-7-14 13:25
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(1, "lisi", 20);
        Student student2 = new Student(2, "zhangsan", 22);
        Student student4 = new Student(4, "zhang", 22);
        Student studentArr[] = {student1, student2,student4};
//        添加一个学生对象
//        创建一个新的学生对象
        Student student3 = new Student(3, "lmh", 18);
//        将新的学生添加到数组里面，要判断数组中是否存满  如果满了的话，则就需要一个新的数组
        boolean flag = exist(studentArr, student3);
        if (flag) {
//            存在
            System.out.println("该id已经存在，请重新输入");
        } else {
//            不存在 添加数据
//            判断数组是否存满  如果满了 则创建一个新的数组
            int count = getCount(studentArr);
            if (studentArr.length == count) {
//                数组存满了  创建一个新的数组  原数组+1
                Student newArr[] = new Student[studentArr.length + 1];
                for (int i = 0; i < studentArr.length; i++) {
                    newArr[i] = studentArr[i];
                }
//                把新的数据加到新的数组当中
                newArr[count] = student3;
//                遍历
                ergodic(newArr);
            } else {
//            如果没有满  直接添加
                studentArr[count] = student3;
//            遍历数组
                ergodic(studentArr);
            }
        }

//        删除学生
        int delIndex =  getIndex(studentArr,student4);
        if (delIndex>=0){
//            删除
            studentArr[delIndex] = null;
//            遍历学生
            ergodic(studentArr);
        }else {
//            没有找到指定学生
            System.out.println("删除失败");
        }
    }

    //    判断是否存在
    public static boolean exist(Student[] studentArr, Student student) {
        for (int i = 0; i < studentArr.length; i++) {
            if (studentArr[i].getId() == student.getId()) {
                return true;
            }
        }
//        不存在
        return false;
    }

    //        判断数组是否满
    public static int getCount(Student student[]) {
        int count = 0;
//        判断数组中有几个null  如果有空值  证明还有空位子，如果没有空值，则count++
        for (int i = 0; i < student.length; i++) {
            if (student[i] != null) {
                count++;
            }
        }
        return count;
    }
//    删除指定id的学生信息
    public  static  int getIndex(Student[] studentArr,Student student){
        int index ;
        for (int i = 0; i < studentArr.length; i++) {
            if (studentArr[i]!=null){
                if (studentArr[i].getId() == student.getId()) {
//                找到指定学生了
                    index = i;
                    return index;
                }
            }

        }
//        没有找到
        return  -1;
    }

    //        遍历数组
    public static void ergodic(Student[] studentArr) {
        for (int i = 0; i < studentArr.length; i++) {
            if (studentArr[i]!=null){
                    System.out.println(studentArr[i].getName() + "---" + studentArr[i].getAge());
            }
        }

    }
}
