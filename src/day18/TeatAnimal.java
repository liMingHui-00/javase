package day18;

public class TeatAnimal {
    public static void main(String[] args) {
        Animal pig = new Animal() {
            @Override
            public void eat() {
                System.out.println("🐖吃🥩");
            }
        };
        pig.eat();
    }
}
