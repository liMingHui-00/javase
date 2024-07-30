package day14;

/**
 * @Author：lmh
 * @Create: 2024-7-14 9:38
 */
public class RoleTest {
    public static void main(String[] args) {
        Role role1 = new Role("鸣人", 100,'男');
        Role role2 = new Role("雏田", 100,'女');
        while (true) {
            role1.attack(role2);
            if (role2.getBlood()==0){
                System.out.println(role1.getName()+"ko了"+role2.getName());
                break;
            }
            role2.attack(role1);
            if (role1.getBlood()==0){
                System.out.println(role2.getName()+"ko了"+role1.getName());
                break;
            }
        }
//        role1.showInfo(role1);
//        role2.showInfo(role2);
    }
}
