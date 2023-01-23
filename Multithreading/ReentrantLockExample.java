package Mutithreading;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    public static class PriceContainer{
        public Lock getLockObject() {
            return lockObject;
        }

        public void setLockObject(Lock lockObject) {
            this.lockObject = lockObject;
        }

        private Lock lockObject=new ReentrantLock();
        private String BTC;
        private String ETH;
        private String BCH;
        public String getETH() {
            return ETH;
        }

        public void setETH(String ETH) {
            this.ETH = ETH;
        }


        public String getBCH() {
            return BCH;
        }

        public void setBCH(String BCH) {
            this.BCH = BCH;
        }



        public String getBTC() {
            return BTC;
        }

        public void setBTC(String BTC) {
            this.BTC = BTC;
        }
    }

    public static class PriceUpdater extends Thread{

        private PriceContainer priceContainer;

        private Random random=new Random();

        public PriceUpdater(PriceContainer priceContainer){
            this.priceContainer=priceContainer;
        }
        public void run(){

             try {
                 priceContainer.getLockObject().tryLock(2, TimeUnit.SECONDS);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }

             try {
                     priceContainer.setBTC("5");
                     System.out.println("BTC price is:" +priceContainer.getBTC());
                 }

             finally {
                 priceContainer.getLockObject().unlock();
             }

        }
    }

    public static void main(String [] args){
        PriceContainer priceContainer=new PriceContainer();
        PriceUpdater priceUpdater=new PriceUpdater(priceContainer);
        Thread t=new Thread(priceUpdater);


        t.start();
    }

}
