import java.util.Scanner;
class ATMSwitch
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the account balance");
      double balance=sc.nextDouble();
      System.out.println("Enter your choice");
      System.out.println("1.Deposit"+"/n"+"2.Withdraw"+"/n"+"3.Balance enquiry"+"/n"+"4.change pin");
      int choice=sc.nextInt();
      switch(choice)
        {
          case 1:
            System.out.println("Enter the amount to deposit");
            double deposit=sc.nextDouble();
            double total=balance+deposit;
            System.out.println("total");
            System.out.println("successfully deposit");
            break;
          case 2:
            System.out.println("Enter the amount to withdraw");
            double draw=sc.nextDouble();
            if(balance>draw)
            {
              double result=balance-draw;
              System.out.println("withdraw successfully");
            }
            else
              System.out.println("Insufficient amount");
            break;
          case 3:
            System.out.println("Balance is:"+balance);
            break;
          case 4:
            System.out.println("Enter the pin");
            int pin=sc.nextInt();
            if(pin==1234)
            {
              System.out.println("valid pin");
            }
            else
              System.out.println("Invalid pin");
        }
    }
  }
      