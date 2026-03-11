public class TransactionFeeCheckingAccount extends CheckingAccount{
private static final double FEE = 2.00;
public TransactionFeeCheckingAccount(double interest) {
super(interest);
 }
 public TransactionFeeCheckingAccount(double interest, double balance) {
super(interest,balance);
 }
//Can add methods of your choice
  public void chargeFee() {
   super.withdraw(FEE);
  }
  //overridding
  public void deposit(double amount)
  {
   super.deposit(amount-FEE);
  }
  public void withdraw(double amount)
  {
    super.withdraw(amount+FEE);
  }
  public String toString()
  {
    return("Transaction Fee Checking Account: " + super.toString() + " Fee = " + FEE);
  }
}
