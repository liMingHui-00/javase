package day14;

import java.util.Random;

public class Role {
    private int blood;
    private String name;
    private char gender;
    private String face;
    String[] boyFaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlFaces = {"美艳绝伦", "沉鱼落雁", "亭亭玉立", "前凸后翘", "相貌平平", "相貌简陋", "惨不忍睹"};
    //attack攻击描述
    String[] attacks_desc={
            "%s使出一招[螺旋丸],转到对方后面，一掌向%s背心拍去",
            "%s使出了一招[豪火球],冲向%s",
            "%s大喝一声，锤向%s"
    };

    //受伤描述
    String[] injureds_desc={
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处於伤",
            "结果一击命中，%s弯下腰",
            "结果%s痛苦地闷哼一声",
            "结果%s摇摇晃晃",
            "结果%s脸色惨白",
            "结果%s口吐鲜血",
            "结果%s倒了下去"};

    public Role() {
    }

    ;

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        if (gender == '男') {
            int index = new Random().nextInt(boyFaces.length);
            this.face = boyFaces[index];
        } else {
            int index = new Random().nextInt(girlFaces.length);
            this.face = girlFaces[index];
        }
    }

    //    打斗
    public void attack(Role role) {
//        生成随机伤害值
        int hurt = new Random().nextInt(5) + 10;
//       计算剩余血量
        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood <= 0 ? 0 : remainBlood;
        role.setBlood(remainBlood);
//        攻击
        int index = new  Random().nextInt(attacks_desc.length);

        System.out.printf(attacks_desc[index],this.getName(),role.getName());
        System.out.println();
//        受伤
        if (remainBlood>90){
            System.out.printf(injureds_desc[0],role.getName());
            System.out.println();
        } else if (remainBlood>80) {
            System.out.printf(injureds_desc[1],role.getName());
            System.out.println();
        } else if (remainBlood>70) {
            System.out.printf(injureds_desc[2],role.getName());
            System.out.println();
        }else if (remainBlood>60) {
            System.out.printf(injureds_desc[3],role.getName());
            System.out.println();
        }else if (remainBlood>50) {
            System.out.printf(injureds_desc[4],role.getName());
            System.out.println();
        }else if (remainBlood>40) {
            System.out.printf(injureds_desc[5],role.getName());
            System.out.println();
        }else if (remainBlood>30) {
            System.out.printf(injureds_desc[6],role.getName());
            System.out.println();
        }else {
            System.out.printf(injureds_desc[7],role.getName());
            System.out.println();
        }
//        System.out.println(this.getName() + "打了" + role.getName() + "一下造成了" + hurt + "伤害，" + role.getName() + "还剩余" + remainBlood + "血");
    }

    //    展示个人信息
    public void showInfo(Role role) {
        System.out.println("姓名：" + role.getName());
        System.out.println("血量：" + role.getBlood());
        System.out.println("性别：" + role.getGender());
        System.out.println("长相：" + role.getFace());
    }
}
