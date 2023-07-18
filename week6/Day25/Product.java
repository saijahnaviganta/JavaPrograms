/*Create a class called "Product" with instance variables for storing the product name, price, and quantity. Implement a constructor that takes arguments for each variable and initializes the object.*/
class Product
  {
    String name;
    int price;
    String quantity;
    Product(String n,int p,String q)
    {
      name=n;
      price=p;
      quantity=q;
    }
    public void display()
    {
      System.out.println(name+" "+price+" "+quantity);
    }
public static void main(String args[])
  {
  Product product=new Product("Rice",1200,"25kgs");
    Product product1=new Product("Soap",240,"25gms");
    Product product2=new Product("Oil",3500,"15lts");
    Product product3=new Product("Detergent powder",120,"1kg");
    product.display();
    product1.display();
    product2.display();
    product3.display();
  }
  }
