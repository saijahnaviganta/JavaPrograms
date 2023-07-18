/*Create a class called "BankAccount" with instance variables for storing the account holder's name and account balance. Implement a method named initializeAccount that takes arguments for each variable and initializes the object. Implement another method named displayAccountDetails to display the account holder's name and balance.*/
import java.util.*;
class BankAccounttwo
  {
    String name;
    long balance;
    public void initializeAccount(String n,long bal)
    {
     name=n;
     balance=bal;
    }
    public void displayAccountDetails()
    {
      System.out.println("The account holder name is:"+name);
      System.out.println("The account holder balance is:"+balance);
    }
    public static void main(String args[])
    {
      BankAccounttwo b=new BankAccounttwo();
       BankAccounttwo b1=new BankAccounttwo();
       BankAccounttwo b2=new BankAccounttwo();
      b.initializeAccount("Jahnavi",50000);
      b1.initializeAccount("swetha",40000);
      b2.initializeAccount("Rajeswari",80000);
      b.displayAccountDetails();
      b1.displayAccountDetails();
      b2.displayAccountDetails();
    }
  }