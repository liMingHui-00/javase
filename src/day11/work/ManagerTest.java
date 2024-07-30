package day11.work;

/**
 * @Author：lmh
 * @Create: 2024-7-11 19:21
 */
public class ManagerTest {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.name="周扒皮";
        manager.id = 123;
        manager.bonus=6000;
        manager.salary=15000;
        manager.work(manager.name, manager.id, manager.salary, manager.bonus);
    }
}
