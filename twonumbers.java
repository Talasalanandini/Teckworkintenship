import java.util.Scanner;
class twonumbers
  {
    public static void main(String args[])
    {
      int i,j;
      Scanner obj=new Scanner(System.in);
      System.out.print("Enter values for num1,num2:");
      i=obj.nextInt();
      j=obj.nextInt();
      if(i > j)
        System.out.println(i+"is maximum number");
      else
        System.out.println(j+"is maximum number");
    }
  }