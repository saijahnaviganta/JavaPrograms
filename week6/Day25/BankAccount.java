/*Create a class called "BankAccount" with instance variables for storing the account holder's name and account balance. Implement methods to deposit and withdraw money from the account, and display the current balance.*/
import java.util.Scanner;
class BankAccount
  {
    String name;
    long balance;
    int amount;
    int draw;
    long dep;
    public void display()
    {
      System.out.println("Account holder name:"+name);
      System.out.println("Account balance:"+balance);
    }
    public void deposit()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Balance is"+balance);
      System.out.println("Enter the amount to deposit");
      long amount=sc.nextInt();
      dep=balance+amount;
      System.out.println("After depositing the balance is:"+dep);
    }
    public void withdraw()
    {
      if(balance>draw)
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amoun you want to withdraw");
        long draw=sc.nextInt();
       long bal=dep-draw;
        System.out.println(bal);
      }
    }
    public static void main(String args[])
    {
      BankAccount acc=new BankAccount();
      acc.name="Jahnavi";
      acc.balance=50000;
      acc.display();
      acc.deposit();
      acc.withdraw();
    }
  }