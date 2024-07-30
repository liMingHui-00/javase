package day12.work;
public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("老王", 35);
        Person person2 = new Person("小芳", 23);
        Person personArr[] = {person1,person2};
        for (int i = 0; i < personArr.length; i++) {
            if (personArr[i].age>personArr[i+1].age){
                System.out.println(personArr[i].name+"年龄大");
                break;
            }else {
                System.out.println(personArr[i+1].name+"年龄大");
                break;
            }
        }
    }
}
