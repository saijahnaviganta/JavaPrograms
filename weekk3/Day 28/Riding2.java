/*Design a class Vehicle with a method start_engine that prints a generic message like "Engine starting." Create two derived classes, Car and Motorcycle, that override the start_engine method with more specific messages like "Car engine starting" and "Motorcycle engine starting."*/
class Vehicle
  {
    public void startEngine()
    {
      System.out.println("Engine starting");
    }
  }
class Car extends Vehicle
  {
    public void startEngine()
    {
      System.out.println("Car engine starting");
    }
  }
class Motorcycle extends Vehicle
  {
  public void startEngine()
    {
    System.out.println("Motorcycle engine starting");
    }
  }
class Riding2
  {
    public static void main(String args[])
    {
    Vehicle v=new Vehicle();
    v.startEngine();
    Vehicle c=new Car();
    c.startEngine();
    Vehicle mc=new Motorcycle();
    mc.startEngine();
    }
  }