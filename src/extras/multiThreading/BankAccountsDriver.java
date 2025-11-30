package extras.multiThreading;

public class BankAccountsDriver {
    public static void main(String[] args) {
        BankAccounts sbi = new BankAccounts(4000);
        Runnable task = new Runnable() {
            @Override
            public void run() {
               sbi.withdraw(575);

            }
        };
        Thread t1 = new Thread(task,"Thread 1");
        Thread t2 = new Thread(task,"Thread 2");
        t1.start();
        t2.start();

//        System.out.println("The finalized balance is : "+sbi.getBalance());

    }
}
