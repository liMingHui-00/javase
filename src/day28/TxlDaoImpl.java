package day28;

import java.util.*;

public class TxlDaoImpl implements TxlDao {
    TreeMap<String, List<Txl>> treeMap = new TreeMap<>();
    {
        ArrayList<Txl> txls = new ArrayList<>();
        Txl t1 = new Txl("王五", "13012345678");
        Txl t2 = new Txl("碗五", "13012345678");
        txls.add(t1);txls.add(t2);
        treeMap.put("W",txls);
    }
    Scanner scanner = new Scanner(System.in);

    public void ui() {
        while (true) {
            System.out.println("======通讯录======");
            System.out.println("1.添加联系人");
            System.out.println("2.查看全部联系人");
            System.out.println("3.根据分组查看联系人");
            System.out.println("4.根据姓名关键字查看联系人");
            System.out.println("5.根据电话关键字查看联系人");
            System.out.println("6.修改联系人");
            System.out.println("7.删除联系人");
            System.out.println("8.退出");
            System.out.println("请输入你的选择");
            String choose = scanner.next();
            switch (choose) {
                case "1":
                    add();
                    break;
                case "2":
                    findAll();
                    break;
                case "3":
                    findByGroup();
                    break;
                case "4":
                    findByName();
                    break;
                case "5":
                    findByPhone();
                    break;
                case "6":
                    update();
                    break;
                case "7":
                    delete();
                    break;
                case "8":
                    System.exit(0);
                default:
                    System.out.println("输入有误");
                    break;
            }
        }
    }

    @Override
    public void add() {
        // 1， 接受控制台数据 -- 需要验证数据的合法性
        String name;
        String phone;
        while (true) {
            System.out.println("请添加联系人姓名");
            name = scanner.next();
            if (RegTxl.isValidChineseName(name)) {
//               name合法
                break;
            }
        }
        while (true) {
            System.out.println("请输入手机号");
            phone = scanner.next();
            if (RegTxl.isValidPhoneNumber(phone)) {
//                phone合法
                break;
            }
        }
//        把新加入的联系人添加到集合中
        Txl t1 = new Txl(name, phone);
//                获取分组名
        String groupName1 = t1.getGroupName();
        // 3, 从全局的maps集合中根据组名来判断是否已经存在该组数据
        if (treeMap.containsKey(groupName1)) {
//         说明存在这个分组 如果有数据（containKey()），根据key获取list集合数据，把当前的对象加入list集合即可
            treeMap.get(groupName1).add(t1);
            System.out.println("添加成功");
        } else {
//            没有分组，创建分组
            // 5，如果没有数据，创建一个新list集合，把对象加入list集合，最后在吧list集合加入maps集合
            ArrayList<Txl> txls = new ArrayList<>();
            txls.add(t1);
            treeMap.put(groupName1, txls);
            System.out.println("添加成功");
        }
    }

    @Override
    public void findAll() {
        Set<Map.Entry<String, List<Txl>>> entries = treeMap.entrySet();
        for (Map.Entry<String, List<Txl>> entry : entries) {
            System.out.println(entry.getKey());
            for (Txl txl : entry.getValue()) {
                System.out.println("\t" + txl.getName() + "(" + txl.getPhone() + ")");
            }
        }
    }

    @Override
    public void findByGroup() {
        System.out.println("请输入你想要查询的分组");
        String str = scanner.next();
        Set<Map.Entry<String, List<Txl>>> entries = treeMap.entrySet();
        for (Map.Entry<String, List<Txl>> entry : entries) {
            if (entry.getKey().equalsIgnoreCase(str)) {
                for (Txl txl : entry.getValue()) {
                    System.out.println("\t" + txl.getName() + "(" + txl.getPhone() + ")");
                }
                return;
            }
        }
        System.out.println("该分组没有联系人");
    }

    @Override
    public void findByName() {
        System.out.println("请输入你想要的名字");
        String str = scanner.next();
        Set<Map.Entry<String, List<Txl>>> entries = treeMap.entrySet();
        boolean flag = true;
        for (Map.Entry<String, List<Txl>> entry : entries) {
            for (Txl txl : entry.getValue()) {
                if (txl.getName().contains(str)) {
                    System.out.println("\t" + txl.getName() + "(" + txl.getPhone() + ")");
                    flag = false;
                }
            }
        }
        if (flag) {
            System.out.println("没有");
        }
    }

    @Override
    public void findByPhone() {
        System.out.println("请输入你想要的电话");
        String str = scanner.next();
        Set<Map.Entry<String, List<Txl>>> entries = treeMap.entrySet();
        boolean flag = true;
        for (Map.Entry<String, List<Txl>> entry : entries) {
            for (Txl txl : entry.getValue()) {
                if (txl.getPhone().equals(str)) {
                    System.out.println("\t" + txl.getName() + "(" + txl.getPhone() + ")");
                    flag = false;
                }
            }
        }
        if (flag) {
            System.out.println("没有该人");
        }
    }

    @Override
    public void update() {
        System.out.println("请输入你要修改的信息的人");
        String name = scanner.next();
        Set<Map.Entry<String, List<Txl>>> ens = treeMap.entrySet();
        Iterator<Map.Entry<String, List<Txl>>> its = ens.iterator();
        while (its.hasNext()) {
            Map.Entry<String, List<Txl>> en = its.next();
            String key = en.getKey();
            List<Txl> list = en.getValue();
            for (int i = 0; i < list.size(); i++) {
                Txl con = list.get(i);
                if (con.getName().equals(name)) {
                    list.remove(i);
                    if (list.size() == 0) {
                        treeMap.remove(key);
                    }
                }
            }
        }
        System.out.println("修改后人姓名");
        String name2 = scanner.next();
        System.out.println("修改后人的手机号");
        String phone = scanner.next();
        Txl t1 = new Txl(name2, phone);
        String groupName1 = t1.getGroupName();
        if (treeMap.containsKey(groupName1)) {
            treeMap.get(groupName1).add(t1);
            System.out.println("修改成功");
        } else {
            ArrayList<Txl> txls = new ArrayList<>();
            txls.add(t1);
            treeMap.put(groupName1, txls);
            System.out.println("修改成功");
        }
    }

    @Override
    public void delete() {
        // 1，从控制台输入你要删除的联系人的全名
        System.out.println("请输入你要删除的联系人全名");
        String name = scanner.next();
        // 2，遍历maps集合，获取 要删除的联系人信息 并预览
        Set<Map.Entry<String, List<Txl>>> ens = treeMap.entrySet();
        Iterator<Map.Entry<String, List<Txl>>> its = ens.iterator();
        while (its.hasNext()) {
            Map.Entry<String, List<Txl>> en = its.next();
            String key = en.getKey();
            List<Txl> list = en.getValue();
            for (int i = 0; i < list.size(); i++) {
                Txl con = list.get(i);
                if (con.getName().equals(name)) { // 查到了需要删除的联系人信息
                    System.out.println("你要删除的联系人信息：" + con.toString());
                    // 3，提示是否确定删除
                    System.out.println("确定删除吗?(Y/N)");
                    String is = scanner.next();
                    // 4，如果确定删除，则从list集合中删除数据
                    if (is.equalsIgnoreCase("y")) {
                        list.remove(i);
                        // 5，判断list集合删除后的长度是否为0
                        // 6，如果list集合长度为0，说明该组就没有数据了，则直接从maps集合中删除当前list集合
                        if (list.size() == 0) {
                            treeMap.remove(key); // 根据key删除数据
                        }
                        System.out.println("删除成功！");
                        return;
                    } else {
                        System.out.println("取消删除！");
                        return;
                    }

                }
            }
        }
        System.out.println("查无此人！");
    }
}