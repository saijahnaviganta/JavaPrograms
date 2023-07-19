/*Create a class called "BankAccount" with instance variables for storing the account holder's name and account balance. Implement a method named initializeAccount that takes arguments for each variable and initializes the object. Implement another method named displayAccountDetails to display the account holder's name and balance.*/
import java.util.Scanner;
class BankArray
  {
    String name;
    long balance;
    public void display()
    {
      System.out.println(name+" "+balance);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      BankArray bank[]=new BankArray[5];
      for(int i=0;i<bank.length;i++)
        {
          System.out.println("Enter Bank"+(i+1)+"details");
          bank[i]=new BankArray();
          System.out.println("Enter account holder name");
          bank[i].name=sc.next();
          System.out.println("Enter account balance");
          bank[i].balance=sc.nextInt();
        }
      for(int i=0;i<bank.length;i++)
        {
          bank[i].display();
        }
    }
  }