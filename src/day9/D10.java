package day9;

/**
 * @Author：lmh
 * @Create: 2024-7-9 16:56
 */
public class D10 {
    public class Student {
        int id;
        String name;
        int age;

        public Student(int id) {
            this.id = id;
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Student(String name, int id, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public Student() {
            System.out.println("无参构造器");
        }

        public void show() {
            System.out.println(name + id + age);
        }

    }


}
