import java.util.Scanner;

class Deleting {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array size");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter the elements into array");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the element you want to delete");
    int del = sc.nextInt();
    System.out.println("Enter the position of del element");
    int pos = sc.nextInt();
    for (int i = pos; i < size; i++) {
      if (i == pos) {
        arr[i] = arr[i + 1];
      }
    }
    System.out.println("After deleting the array are");
    for (int i = 0; i < arr.length - 1; i++) {
      System.out.println(arr[i]);
    }
  }
}