import java.util.Scanner;
class RightRota
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
  System.out.println("Before right rotating the array are");
  for(int i=0;i<a.length;i++)
    {
      System.out.print(a[i]+" ");
    }
  System.out.println();
  System.out.println("After right rotating the array are");
  int temp=a[a.length-1];
  for(int i=a.length-1;i>0;i--)
    {
      a[i]=a[i-1];
    }
  a[0]=temp;
  for(int i=0;i<a.length;i++)
    {
      System.out.print(a[i]+" ");
    }
}
}