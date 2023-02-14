import java.util.Scanner;
class character
  {
    public static void main(String args[])
    {
      char ab;
      Scanner d=new Scanner(System.in);
      System.out.println("Enter a character:");
      ab=d.next().charAt(0);
      if((ab >= 'A' && ab <= 'z')||ab >= 'a' && ab <= 'z')
        System.out.println("Given character is an alphabet");
      else
        System.out.println("Given character is not an alphabet");
        
    }
  }