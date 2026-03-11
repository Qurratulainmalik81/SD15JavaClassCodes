public class FeeAccount extends BankAccount {

  FeeAccount(double initialBalance)
  {
    super(initialBalance);
   
  }
    public void withdraw(double amount) { 
    super.withdraw(amount);
    if (getBalance() < 100.00)
    super.withdraw(2.00); // charge $2 fee
} 
}
