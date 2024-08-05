package day34;

public class Saler {
    int productCount = 10;
    public synchronized void sc(){
        if (productCount<10){
            System.out.println("库存不足");
            productCount++;
            System.out.println(Thread.currentThread().getName()+"生产了一件商品，当前库存为："+productCount);
            this.notifyAll();
        }else {
            System.out.println("库存充足");
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public synchronized void xf(){
        if (productCount>0){
            productCount--;
            System.out.println(Thread.currentThread().getName()+"消费了一件商品，当前库存为："+productCount);
            this.notifyAll();
        }else {
            System.out.println("库存不足");
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
