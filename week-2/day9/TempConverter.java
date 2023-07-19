import java.util.Scanner;
class TempConverter
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter c or f");
      char ch=sc.next().charAt(0);
      if(ch=='f'||ch=='F')//he wants farenheit he already contains celsius temperature
      {
        System.out.println("Enter the temperature value:");
       double Celsius=sc.nextDouble();
       double temp = Celsius*1.8+32;
      System.out.println("Fahrenheit:"+temp);
      }
      else if(ch=='c'||ch=='C')
      {
        System.out.println("Enter the temperature value:");
        double Fahrenheit=sc.nextDouble();
        double temp= 5/9 * (Fahrenheit-32);
        System.out.println("Celsius:"+temp);
      }
      else 
        System.out.println("Invalid input");
    }
  }