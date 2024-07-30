package day20;

import java.util.Scanner;

public class BookDaoImpl implements BookDao{
    Book book[] = new  Book[10];
    private static final String ADD_BOOK = "1";
    private static final String DELETE_BOOK = "2";
    private static final String UPDATE_BOOK = "3";
    private static final String SELECT_BY_ID_BOOK = "4";
    private static final String SELECT_BY_NANE_BOOK = "5";
    private static final String SELECT_BY_PRICE_BOOK = "6";
    private static final String SELECT_ALL_BOOK = "7";
    private static final String EXIT = "8";

    boolean flag = true;
    Scanner scanner = new Scanner(System.in);
    @Override
    public void ui() {

        while (flag){
            System.out.println("*******************");
            System.out.println("图书信息管理系统");
            System.out.println("*******************");
            System.out.println("1- 添加图书信息");
            System.out.println("2- 删除图书信息");
            System.out.println("3- 修改图书信息");
            System.out.println("4- 根据编号查询图书信息");
            System.out.println("5- 根据名称模糊查询图书信息");
            System.out.println("6- 根据价格范围查询图书信息");
            System.out.println("7- 查询所有图书信息");
            System.out.println("8- 退出系统");
            System.out.println("*******************");
            System.out.println("请输入你的选择：");
            String choose = scanner.next();
            switch (choose){
                case ADD_BOOK:
                    add();
                    break;
                case DELETE_BOOK:
                    delete();
                    break;
                case UPDATE_BOOK:
                    update();
                    break;
                case SELECT_BY_ID_BOOK:
                    selectById();
                    break;
                case SELECT_BY_NANE_BOOK:
                    selectByName();
                    break;
                    case SELECT_BY_PRICE_BOOK:
                        selectByPrice();
                    break;
                case SELECT_ALL_BOOK:
                    selectAll();
                    break;
                case EXIT:
                    System.out.println("欢迎下次光临");
                    flag = false;
                    break;
            }
        }
    }

    @Override
    public void add() {
// add()--->控制台收集图书信息，把信息组成对象，放入到数组中
// （编号要唯一【当录入编号时，调用isOnly判断是否唯一，如果唯一，则继续录入信息；如果不唯一，
// 则直接调用add()方法并终止整个方法体】）
        System.out.println("请输入你想要添加的图书信息");
        System.out.println("添加图书的id");
        int id =  scanner.nextInt();
        //                判断该id是否存在
        if (isOnly(id)){
            System.out.println("添加图书的名称");
            String name = scanner.next();
            System.out.println("添加图书的作者");
            String author = scanner.next();
            System.out.println("添加图书的价格");
            int price = scanner.nextInt();
            Book book1 = new Book(id,name,author,price);
            for (int i = 0; i < book.length; i++) {
                if (book[i]==null){
                    book[i] = book1;
                    System.out.println("添加成功");
                    break;
                }
            }
        }else {
//            id重复  重新录用
            System.out.println("id重复  重新录用");
            add();
        }
    }

    @Override
    public void delete() {
//从控制台输入你要删除的图书的编号，遍历集合把该编号的对应的图书信息从数组中删除
        System.out.println("请输入你想要删除的图书的id");
        int id = scanner.nextInt();
        for (int i = 0; i < book.length; i++) {
//            查找该图书并删除
            if (book[i]!=null&&book[i].getId()==id){
                book[i]=null;
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("没有该图书，删除失败");
    }

    @Override
    public void update() {
//根据编号来来重新从控制台中输入新的书名，作者，价格，进行修改
        System.out.println("请输入你想要更改图书信息的id");
        int id = scanner.nextInt();
        for (int i = 0; i < book.length; i++) {
            if (book[i]!=null&&book[i].getId()==id){
                System.out.println("图书的名称");
                String nameNew = scanner.next();
                System.out.println("图书的作者");
                String authorNew = scanner.next();
                System.out.println("图书的价格");
                int priceNew = scanner.nextInt();
                book[i].setName(nameNew);
                book[i].setAuthor(authorNew);
                book[i].setPrice(priceNew);
                System.out.println("修改成功");
                return;
            }
        }
        System.out.println("没有该图书，请核对后重新输入！");
    }

    @Override
    public void selectById() {
//        从控制台输入你要查询的图书编号，根据编号查询，存在则打印，反之则查无此人
        System.out.println("请输入想要查询的图书的编号");
        int id = scanner.nextInt();
        for (int i = 0; i < book.length; i++) {
            if (book[i]!=null&&book[i].getId()==id){
//                查到了  把该图书打印出来
                System.out.println("编号为"+book[i].getId()+"的书的名字为"+book[i].getName()+"他的作者是"+book[i].getAuthor()+"价格为"+book[i].getPrice());
                return;
            }
        }
        System.out.println("没有该图书，请核对后再次查询！");

    }

    @Override
    public void selectByName() {
//从控制台输入你要查询的书名的关键字，根据书名查询，存在则打印，反之则查无此书【contains()】
        System.out.println("请输入想要查询的图书的名字");
        String name= scanner.next();
        for (int i = 0; i < book.length; i++) {
            if (book[i]!=null&&book[i].getName().contains(name)){
//                查到了  把该图书打印出来
                System.out.println("编号为"+book[i].getId()+"的书的名字为"+book[i].getName()+"他的作者是"+book[i].getAuthor()+"价格为"+book[i].getPrice());
                return;
            }
        }
        System.out.println("没有该图书，请核对后再次查询！");
    }

    @Override
    public void selectByPrice() {
//从控制台输入你要查询的价格的最小值和最大值，根据价格范围查询，存在则打印，反之则查无此书
        System.out.println("请输入想要查询的图书价格的最大值");
        int priceMax= scanner.nextInt();
        System.out.println("请输入想要查询的图书价格的最小值");
        int priceMin= scanner.nextInt();
        for (int i = 0; i < book.length; i++) {
            if (book[i]!=null&&book[i].getPrice()<=priceMax&&book[i].getPrice()>=priceMin){
//                查到了  把该图书打印出来
                System.out.println("编号为"+book[i].getId()+"的书的名字为"+book[i].getName()+"他的作者是"+book[i].getAuthor()+"价格为"+book[i].getPrice());
            }
        }
    }

    @Override
    public void selectAll() {
//遍历图书信息数组，打印信息
        for (int i = 0; i < book.length; i++) {
            if (book[i]!=null){
                System.out.println("编号为"+book[i].getId()+"的书的名字为"+book[i].getName()+"他的作者是"+book[i].getAuthor()+"价格为"+book[i].getPrice());
            }
        }
    }

    @Override
    public boolean isOnly(int id) {
        for (int i = 0; i < book.length; i++) {
            if (book[i]!=null){
//                判断id是否唯一  如果存在就返回false
                if (book[i].getId() ==id){
                    return false;
                }
            }
        }
        return true;
    }
}
