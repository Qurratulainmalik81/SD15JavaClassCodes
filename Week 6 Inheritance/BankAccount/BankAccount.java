 class BankAccount {
  private double myBal;
  public BankAccount() { myBal = 0; }
  public BankAccount(double bal)
  {
    this.myBal = bal;
  }
  public double getBalance() { return myBal; }
  public void setBalanace(double amount)
  {
    this.myBal = amount;
  }
  public void deposit(double amount)
  {
    this.myBal = this.myBal + amount;

  }
  public void withdraw(double amount)
  {
if(this.myBal>=amount)
this.myBal = this.myBal - amount;
else
    System.out.println("You do not have enough balanace for the transaction");
  }
  public String toString()
  { return ("Balance: $" + this.myBal);}
}
