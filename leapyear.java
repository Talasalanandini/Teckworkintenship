import java.util.Scanner;
class leapyear
  {
    public static void main(String args[])
    {
      int year;
      Scanner y=new Scanner(System.in);
      System.out.print("Enter value for year:");
      year=y.nextInt();
      if(year % 400 ==0){
        System.out.println(year+"is a leap year");
      }
      else if(year % 100 ==0)
        System.out.println(year+"is not a leap year");
      else if(year % 4 ==0)
        System.out.println(year+"is a leap year");
      else
        System.out.println(year+"is not a leap year");
      
    }
  }