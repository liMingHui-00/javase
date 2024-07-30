package day15.pm;

public class D1 {
  static  String name;
  int age;
  public static  void  study(){
      cc();
      System.out.println(name+"学习");
  }
  public  void say(){
      System.out.println(age);
  }
  public static  void cc(){
      System.out.println("ccc");
  }

    public static void main(String[] args) {
      D1.name="李四";
      D1.cc();
      D1.study();
        D1 d1 = new D1();
        d1.say();
        System.out.println("***********");
        d1.cc();
    }
}
