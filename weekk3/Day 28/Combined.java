/*Create a class BankAccount with methods deposit and withdraw. Implement method overloading to handle different variations of deposit and withdraw methods:
deposit(amount): Deposits the given amount.deposit(amount, description): Deposits the given amount with a provided description.withdraw(amount): Withdraws the given amount.withdraw(amount, description): Withdraws the given amount with a provided description.*/
import java.util.Scanner;
class BankAccount
  {
    int amount=50000;
    public void deposit(int deposit)
    {
      System.out.println(amount);
      amount=deposit+amount;
      System.out.println("After depositing the amount is:"+amount);
    }
    public void deposit(int deposit,String description)
    {
     System.out.println(amount);
      amount=deposit+amount;
      System.out.println("After depositing the amount is:"+amount);
      System.out.println(description);
    }
 public void withdraw(int draw)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Before withdraaw amount is:"+amount);
      if(amount>draw)
      {
        amount=amount-draw;
        System.out.println("After withdraaw balance amount is:"+amount);
      }
    }
    public void withdraw(int draw,String description)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Before withdraaw amount is:"+amount);
      if(amount>draw)
      {
        amount=amount-draw;
        System.out.println("After withdraaw balance amount is:"+amount);
        System.out.println(description);
      }
    }
  }
  class Combined
    {
      public static void main(String args[])
      {
        BankAccount ba=new BankAccount();
        ba.deposit(5000);
        ba.deposit(5000,"Amount deposited succcessfully");
        ba.withdraw(2000);
        ba.withdraw(2000,"Amount withdraw successfully ");
      }
    }
    