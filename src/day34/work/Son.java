package day34.work;

public class Son implements Runnable {
    Card card;

    public Son(Card card) {
        this.card = card;
    }

    @Override
    public void run() {
        while (true){
            try {
                card.withdrawCash();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
