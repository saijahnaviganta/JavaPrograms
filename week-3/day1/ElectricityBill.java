/*9. Electricity bill app along with GST: create an application that takes previous units and present units, and find number of units, based on numbers of units find the electricity bill along with GST. use conditional statements to determine the unit slabs.*/     
import java.util.Scanner;
class ElectricityBill
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      float amount;
      System.out.println("Enter previous units");
      float previous=sc.nextFloat();
      System.out.println("Enter present units");
      float present=sc.nextFloat();
      float unit=present-previous;
      System.out.println(unit);
      if(unit<=50)
      {
        amount=(unit*0.50f);
      }
      else if(unit<150)
      {
        amount=(unit*0.75f);
      }
      else
      {
        amount=(unit*1.50f);
      }
       float subcharge=(amount*0.2f);
      float totalamount=(amount+subcharge);
      System.out.println("Total electricity bill:"+totalamount);
    }
  }