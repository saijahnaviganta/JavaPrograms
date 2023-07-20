/*Assignment 2: Method Overriding
Create a base class called Animal with a method make_sound that prints a generic sound made by an animal. Create two derived classes, Dog and Cat, that override the make_sound method to print "Woof" and "Meow" respectively.*/
class Animal
  {
    public void make_sound()
    {
      System.out.println("Every animal make different sounds");
    }
  }
class Dog extends Animal
  {
    public void make_sound()
    {
      System.out.println("Dog bark like bow bow");
    }
  }
class Cat extends Animal
  {
    public void make_sound()
    {
      System.out.println("Cat sound like meow meow");
    }
  }
class Riding1
  {
    public static void main(String args[])
    {
      Animal a=new Animal();
      a.make_sound();
      Animal d=new Dog();
      d.make_sound();
      Animal c=new Cat();
      c.make_sound();
    }
  }