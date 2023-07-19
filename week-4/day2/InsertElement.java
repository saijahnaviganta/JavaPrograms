import java.util.Scanner;
class InsertElement
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a[]={23,34,45,56,67};
      int b[]=new int[a.length+1];
    System.out.println("Enter the value to insert ");
int value=sc.nextInt();
System.out.println("Enter the index position");
int index=sc.nextInt();
for(int i=0;i<b.length;i++)
  {
    if(i==index)
    {
      b[i]=value;
    }
    else if(i>index)
    {
      b[i]=a[i-1];
    }
    else
    {
      b[i]=a[i];
    }
  }
System.out.println("The array elements are");
for(int i=0;i<b.length;i++)
  {
    System.out.println(b[i]);
  }
}
}