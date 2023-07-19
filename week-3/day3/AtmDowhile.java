import java.util.Scanner;
class AtmDowhile
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      char option;
      System.out.println("enter the previous account balance");
      double balance=sc.nextDouble();
      do{
        System.out.println("Select the number");
        System.out.println("1.Deposit"+"\n"+"2.Withdrawl"+"\n"+"3.View Balance"+"\n"+"4.Exit"+"\n");
        int choose=sc.nextInt();
      switch(choose)
        {
          case 1: 
          System.out.println("Enter the deposit amount");
          double deposit=sc.nextDouble();
          double total=balance+deposit;
          System.out.println("Deposit successfully");
            break;
          case 2:
            System.out.println("Enter the withdrawl amount");
            double withdraw=sc.nextDouble();
            if(balance>withdraw)
            {
              double present=balance-withdraw;
              System.out.println("amount withdrawl successfully");
            }
            else 
              System.out.println("Insufficient amount");
            break;
          case 3:
            System.out.println("The balance is:"+balance);
            break;
          case 4:
              System.exit(0);
            }
         System.out.println("do you want to continue:(y/n");
           option=sc.next().charAt(0);
  }
        while(option=='y'||option=='Y');
      }
    }