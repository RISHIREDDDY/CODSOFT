package codsoft;
class BankAccount{
    private double balance;
    public BankAccount(double balance)
    {
        this.balance = balance;
    }
    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance += amount;
            System.out.println("amount has been deposited!"+amount);
        }
        else{
            System.out.println("amount has not been deposited");
        }
    }
    public boolean withdraw(double amount)
    {
        if(amount>0&&amount<=balance)
        {
            balance -= amount;
            System.out.println("your withdrawn amount"+amount);
            return true;
        }
        else if(amount > balance)
        {
            System.out.println("you have invalid balance!");
        }
        else {
            System.out.println("invalid withdrawn amount!");
        }
        return false;
    }
    public double checkBalance()
    {
        return balance;
    }
}
//
