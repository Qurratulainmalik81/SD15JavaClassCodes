public class BankingDemo {
    public static void main(String[] args)
    {

        BankAccount b = new FeeAccount(100);
        b.withdraw(5.00);
        System.out.println(b.getBalance());

    //    BankAccount BA = new CheckingAccount(0.5);
    //    BA.deposit(100);
    //    System.out.println(BA);

     
    //    TransactionFeeCheckingAccount TFCA = new TransactionFeeCheckingAccount(0.5,5000);
    //    BankAccount b2 = new TransactionFeeCheckingAccount(0.3,500);
    //    b2.deposit(100);
    //    System.out.println(b2);


       // Object O = new BankAccount();
        // BankAccount b = new BankAccount();
        // System.out.println(b);
        // b.deposit(3000);
        //  System.out.println(b);
        //  b.withdraw(100);
        //   System.out.println(b);

        // CheckingAccount ca = new CheckingAccount(0.3);
        // System.out.println(ca);
        // ca.deposit(1000);
        // System.out.println(ca);
        // ca.applyInterest();
        // System.out.println("Interst applied " + ca);
        // CheckingAccount ca2= new CheckingAccount(0.3, 1000);
        // System.out.println(ca2);
        
        // 
    }
}
