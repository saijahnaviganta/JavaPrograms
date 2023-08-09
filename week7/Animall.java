/*Assignment 3: Animal Hierarchy
Create an abstract class called "Animal" with the following abstract methods:
speak(): Outputs the sound that the animal makes.move(): Describes how the animal moves.
Create concrete classes Dog, Cat, and Bird that inherit from the abstract class "Animal." Implement the required methods for each class.
Write a program to:
Create instances of Dog, Cat, and Bird.Display the sound and movement of each animal.*/
abstract class Animal
  {
    abstract void speak();
    abstract void move();
  }
class Dog extends Animal
  {
    public void speak()
    {
      System.out.println("The dog makes sounds as bow-bow");
    }
    public void move()
    {
      System.out.println("The dog walks speed");
    }
  }
class Cat extends Animal
  {
    public void speak()
    {
      System.out.println("The cat makes sounds as meow-meow");
    }
    public void move()
    {
      System.out.println("The cat moves slowly");
    }
  }
class Bird extends Animal
  {
    public void speak()
    {
      System.out.println("The birds sounds like melody");
    }
    public void move()
    {
      System.out.println("The birds fly");
    }
  }
class Animall
  {
    public static void main(String args[])
    {
      Dog d=new Dog();
      d.speak();
      d.move();
      Cat c=new Cat();
      c.speak();
      c.move();
      Bird b=new Bird();
      b.speak();
      b.move();
    }
  }

