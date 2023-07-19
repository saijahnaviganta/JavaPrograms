class Animal
  {
    public void eat()
    {
      System.out.println("eating");
    }
  }
class Dog extends Animal
  {
    public void bark()
    {
      System.out.println("barking");
    }
  }
class Lion extends Animal
  {
    public void killing()
    {
      System.out.println("kill other animals");
    }
  }
class Hierarchialinheritance
  {
    public static void main(String args[])
    {
      Lion l=new Lion();
      Dog d=new Dog();
      l.killing();
      d.bark();
      l.eat();
    }
  }