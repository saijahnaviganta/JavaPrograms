//Online Shopping System: In an online shopping system, there may be a superclass called Product with a method called calculateDiscount() that calculates the discount on the product's price. Different types of products, such as Electronics and Apparel, may be subclasses of Product and override the calculateDiscount() method to calculate the discount based on their specific sales and promotions. For example, an Electronics product may offer a discount based on the purchase amount or bundle deals, while an Apparel product may offer a discount based on the seasonal trends or inventory clearance.
import java.util.Scanner;
class Product
  {
    int price=5000;
    public void calculateDiscount()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the discount based on product sales");
      double discount=sc.nextDouble();
      double finalprice=price*discount;
      double saleprice=price-finalprice;
      System.out.println(saleprice);
    }
  }
class Electronics extends Product
  {
    public void calculateDiscount()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the electricity discount based on their sale");
      double ediscount=sc.nextDouble();
      System.out.println("After discounting the product the final price is");
      double finalprice=price*ediscount;
      double saleprice=price-finalprice;
      System.out.println(saleprice);
    }
  }
class Apparel extends Product
  {
    public void calculateDiscount()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the apparel discount based on their sale");
      double adiscount=sc.nextDouble();      System.out.println("After discounting the product the final price is");
      double finalprice=price*adiscount;
     double saleprice=price-finalprice;
      System.out.println(saleprice);
    }
  }
class Online 
  {
    public static void main(String args[])
    {
      Product p=new Product();
      p.calculateDiscount();
      Product e=new Electronics();
      e.calculateDiscount();
      Product a=new Apparel();
      a.calculateDiscount();
    }
  }