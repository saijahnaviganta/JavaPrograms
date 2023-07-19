import java.util.Scanner;
class Lefttwopos
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
  System.out.println("Enter the array size");
  int size=sc.nextInt();
  int a[]=new int[size];
  System.out.println("Enter the elements into an array");
  for(int i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
    }
  System.out.println("Before left rotating the array are");
  for(int i=0;i<a.length;i++)
    {
      System.out.print(a[i]+" ");
    }
  System.out.println();
  System.out.println("Enter how many position shifts we have");
  int number=sc.nextInt();
  System.out.println("After left rotating the array are");
  for(int i=0;i<number;i++)
    {
  int temp=a[0];
  for(int j=0;j<a.length-1;j++)
    {
      a[j]=a[j+1];
    }
  a[a.length-1]=temp;
    }
  for(int i=0;i<a.length;i++)
    {
      System.out.print(a[i]+" ");
    }
}
}