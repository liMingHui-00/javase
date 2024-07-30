package day14;

/**
 * @Author：lmh
 * @Create: 2024-7-14 11:29
 */
public class GoodsTest {
    public static void main(String[] args) {
        Goods goods1 = new Goods("落地扇", "001", 145, 201);
        Goods goods2 = new Goods("水杯", "002", 15, 71);
        Goods goods3 = new Goods("睡衣", "003", 95, 141);
        Goods goodsArr[] = {goods1,goods2,goods3};
        for (Goods goods :goodsArr){
            System.out.println(goods.getName()+"----"+goods.getPrice()+"---"+goods.getCount());
        }
    }
}
