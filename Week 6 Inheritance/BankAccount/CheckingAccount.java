public class CheckingAccount extends BankAccount {
    private double myInterest;
  public CheckingAccount(double interest) { 
    super();
    this.myInterest = interest;
   }
  public CheckingAccount(double interest, double initialBalance) { 
        super(initialBalance);
        this.myInterest = interest;
   }
  public double getInterest() { return myInterest; }
  public void setInterest(double interest)
  {
    this.myInterest = interest;
  }
  public void applyInterest() { 
    double interest = super.getBalance() * (this.myInterest/100);
    super.deposit(interest);
   }
  public String toString()
  {
    return (super.toString() + " Interest rate " + this.myInterest);
  }

}
