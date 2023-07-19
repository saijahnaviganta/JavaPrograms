class Animal
  {
    public void eat()
    {
      System.out.println("eating");
    }
  }
class Rat extends Animal
  {
    public void noise()
    {
      System.out.println("make noising");
    }
  }
class Singleinheritance
  {
    public static void main(String args[])
    {
      Rat r=new Rat();
      r.noise();
      r.eat();
    }
  }