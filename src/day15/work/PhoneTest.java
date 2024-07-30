package day15.work;

/**
 * @Author：lmh
 * @Create: 2024-7-15 18:54
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone("华为",1200,4);
        Phone phone2 = new Phone("苹果",9000,1);
        Phone phone3 = new Phone("锤子",3000,3);
        Phone phone4 = new Phone("小米",1800,2);
        Phone phoneArr[] = {phone1,phone2,phone3,phone4};
        System.out.println("使用年限小于2年的手机或者价格低于2000的手机有");
        for (int i = 0; i < phoneArr.length; i++) {
            if (phoneArr[i].getYear()<2||phoneArr[i].getPrice()<2000) {
                System.out.println(phoneArr[i].getBrand()+"-"+phoneArr[i].getPrice()+"-"+phoneArr[i].getYear());
            }
        }
    }
}
