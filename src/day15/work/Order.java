package day15.work;

/**
 * @Author：lmh
 * @Create: 2024-7-15 19:15
 */
public class Order {
    private int id;
    private String goodsName;
    private  int count;
    private int price;
    private int total;
    private String name;
    private String address;
    private String phone;
    public void printOrderInfo(){
        System.out.println("订单编号："+id+" 商品名称："+goodsName+" 商品数量："+count+" 商品单价："+price+" 商品总价："+total+" 收货人姓名："+name+" 收货地址："+address+" 收货人手机号："+phone);
    }
    public Order() {
    }

    public Order(int id, String goodsName, int count, int price, String name, String address, String phone) {
        this.id = id;
        this.goodsName = goodsName;
        this.count = count;
        this.price = price;
        this.total = price*count;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int count, int price) {
        this.total = count*price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
