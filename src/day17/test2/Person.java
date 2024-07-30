package day17.test2;

/**
 * @Author：lmh
 * @Create: 2024-7-17 15:23
 */
public class Person {
  private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void feed(Animal animal){
      System.out.println(getName()+"喂养动物"+animal.getName());
      if (animal instanceof Pig){
          ((Pig) animal).eat();
      }
      if (animal instanceof Snack){
          ((Snack) animal).say();
      }
  }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person{name = " + name + "}";
    }
}
