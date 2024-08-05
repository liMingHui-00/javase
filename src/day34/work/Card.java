package day34.work;

public class Card {
    int balance = 88;
    public synchronized void depositMoney() throws InterruptedException {
        if (balance<100){
            balance+=2000;
            System.out.println("向银行卡中存入了2000元, 当前账户余额是"+balance);
            this.notify();
        }else {
            System.out.println("已经有钱花了，等没有钱了再存");
            this.wait();
        }
    }
    public synchronized void withdrawCash() throws InterruptedException {
        if (balance>=100){
            balance -= 100;
            System.out.println("从银行卡中取出了100元, 当前账户余额是"+balance);
            this.notify();
        }else {
            System.out.println("没钱花了, 等有钱的时候再取!");
            this.wait();
        }
    }
}
