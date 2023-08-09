/*Assignment 2: Bank Account Hierarchy
Create an abstract class called "BankAccount" that has the following abstract methods:
deposit(amount): Adds the given amount to the account balance.withdraw(amount): Deducts the given amount from the account balance.get_balance(): Returns the current account balance.
Create concrete classes CheckingAccount and SavingsAccount that inherit from the abstract class "BankAccount." Implement the required methods for each class.
Write a program to:
Create instances of CheckingAccount and SavingsAccount.Prompt the user to make deposits and withdrawals from each account.Display the current balance of each account after each transaction.*/
import java.util.Scanner;
abstract class BankAccount
  {
    long amount=10000;
    abstract void deposit(long dep);
    abstract void withdraw(long draw);
    abstract void get_balance();
  }
class CheckingAccount extends BankAccount
  {
    public void deposit(long dep)
    {
      amount=amount+dep;
      System.out.println("Deposit successfully");
      System.out.println("The total amount after depositing:"+amount);
    }
    public void withdraw(long draw)
    {
      if(amount>draw)
      {
        amount=amount-draw;
        System.out.println("withdraw successfully");
        System.out.println("The amount after withdraw:"+amount);
      }
    }
    public void get_balance()
    {
      System.out.println("The current account balance is:"+amount);
    }
  }
class SavingsAccount extends BankAccount
  {
   public void deposit(long dep)
    {
      amount=amount+dep;
      System.out.println("Deposit successfully");
      System.out.println("The total amount after depositing:"+amount);
    }
    public void withdraw(long draw)
    {
      if(amount>draw)
      {
        amount=amount-draw;
        System.out.println("withdraw successfully");
        System.out.println("The amount after withdraw:"+amount);
      }
    }
    public void get_balance()
    {
      System.out.println("The current account balance is:"+amount);
    }
  }
class Bank 
      {
        public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
          CheckingAccount ca=new CheckingAccount();
          System.out.println("Enter the amount you want to deposit");
          long d=sc.nextInt();
          ca.deposit(d);
          System.out.println("Enter the amount you want to withdraw");
          long w=sc.nextInt();
          ca.withdraw(w);
          ca.get_balance();
          SavingsAccount sa=new SavingsAccount();
           System.out.println("Enter the amount you want to deposit");
          long de=sc.nextInt();
          sa.deposit(de);
          System.out.println("Enter the amount you want to withdraw");
          long wi=sc.nextInt();
          sa.withdraw(wi);
          sa.get_balance();
        }
      }
