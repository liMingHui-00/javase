package day24.work;

public class T2 {
    private String name;
    private int age;

    public T2() {
    }

    public T2(String name, int age) {
        this.name = name;
         setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>150||age<0){
            throw new AgeGT150Exception();
        }else {
            this.age = age;
        }
    }
    public static void main(String[] args) {
    T2 p = new T2("lisi",160);
    }
}
