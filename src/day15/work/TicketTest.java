package day15.work;

/**
 * @Author：lmh
 * @Create: 2024-7-15 19:09
 */
public class TicketTest {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket("北京西","驻马店西","5:30",1546544454,420,"商务座","g521");
        Ticket ticket2 = new Ticket("驻马店西","苏州北","9:30",1546544454,320,"商务座","g168");
        Ticket ticket3 = new Ticket("苏州北","厦门南","13:30",1546544454,220,"商务座","g888");
        ticket1.printTicketInfo();
        ticket2.printTicketInfo();
        ticket3.printTicketInfo();

    }
}
