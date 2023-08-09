/*Assignment 6: Custom Exception in Banking Application Build a simple banking application in Java. Create a custom checked exception named InsufficientFundsException, which will be thrown when a user tries to withdraw an amount that exceeds their account balance. Implement classes for bank accounts, and provide methods for depositing and withdrawing money. Throw the InsufficientFundsException when a withdrawal amount is greater than the available balance. Handle this exception in an appropriate way and display a user-friendly error message.*/
class InsufficientFundsException extends Exception
  {
  InsufficientFundsException(String message)
    {
    super(message);
    }
  }
class Bank
  {
   double balance;
    public void setDetails(double balance)
    {
      this.balance=balance;
    }
    public void deposit(double amount)
    {
      balance=balance+amount;
      System.out.println("Deposit successfully");
      System.out.println("The current balance is:"+balance);
    }
    public void withdraw(double amount) throws InsufficientFundsException
    {
      if(amount>balance)
      {
        throw new InsufficientFundsException("Insufficient balance");
      }
      else 
      {
        System.out.println("Withdrawl successfully");
        balance=balance-amount;
        System.out.println("After withdrawl the balance is:"+balance);
    }
  }
  }
    class Exception
      {
        public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
          withdraw w=new withdraw();
          System.out.println("Enter the balance");
          double amount=sc.nextDouble();
          System.out.println("Enter the amount which you want to withdraaw");
          double withdraw=sc.nextDouble();
          try
            {
              w.withdraw(amount);
            }
          catch(InsufficientFundsException e)
            {
              System.out.println(e);
            }
        }
      }

