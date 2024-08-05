package day34.work;

public class Mother implements Runnable {
    public Mother(Card card) {
        this.card = card;
    }

   Card card;
    @Override
    public void run() {
        while (true){
            try {
                card.depositMoney();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
