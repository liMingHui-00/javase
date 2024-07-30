package day12.work;
public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone("小米MIX2",2999,"新机皇");
        Phone phone2 = new Phone("Iphone8", 5888,"火爆新机");
        Phone phone3 = new Phone("VIVO X9s",1998,"火爆新机");
        Phone phoneArr[] ={phone1,phone2,phone3};
        for (int i = 0; i < phoneArr.length; i++) {
            if (phoneArr[i].price>2000){
                System.out.println(phoneArr[i].name+"-"+phoneArr[i].price+"-"+phoneArr[i].type);
            }
        }
    }
}
