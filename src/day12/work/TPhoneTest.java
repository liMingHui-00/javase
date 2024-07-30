package day12.work;
public class TPhoneTest {
    public static void main(String[] args) {
        TPhone tp1 = new TPhone("华为",1200,4);
        TPhone tp2 = new TPhone("苹果",9000,1);
        TPhone tp3 = new TPhone("锤子",3000,3);
        TPhone tp4 = new TPhone("小米",1200,4);
        TPhone tPhoneArr []= {tp1,tp2,tp3,tp4};
        for (int i = 0; i < tPhoneArr.length; i++) {
            if (tPhoneArr[i].year<2||tPhoneArr[i].price<2000){
                System.out.println(tPhoneArr[i].brand+"-"+tPhoneArr[i].price+"-"+tPhoneArr[i].year);
            }
        }
    }
}
