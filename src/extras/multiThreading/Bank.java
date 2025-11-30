package extras.multiThreading;
class BankAccount{
    private double balance;
    public BankAccount(double balance ){
        this.balance = balance;
    }
    public synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw amount "+ amount);
        if (balance >= amount){
            System.out.println(Thread.currentThread().getName()+" proceeding with withdrawal");

            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
             balance -= amount;
            System.out.println(Thread.currentThread().getName()+" completed withdrawal. Remaining balance is "+balance);
        }else{
            System.out.println(Thread.currentThread().getName()+" Insufficient balance");
        }
    }

}
public class Bank {
    public static void main(String[] args) throws InterruptedException {
        BankAccount sbi = new BankAccount(1000);
        Runnable task = new Runnable() {
            @Override
            public void run() {
                sbi.withdraw(150);
            }
        };
        Thread t1  = new Thread(task,"Thread 1");
        Thread t2  = new Thread(task,"Thread 2");
        t1.start();
        t2.start();
//        t1.join();
//        t2.join();

    }
}
