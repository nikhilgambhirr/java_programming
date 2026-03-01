import java.util.*;
class Program054
{
  public static void main(String A[] ) 
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the string");
    String str = sobj.nextLine();

    int i = 0;

    char Arr[] = str.toCharArray();

    for(i = 0; i< Arr.length;i++)
    {
      if(Arr[i] ==' ')
      {
         Arr[i] = '-';
      }
      
    }
    String newstr = new String(Arr);
    System.out.println("Upadated String  : "+newstr);

  }
}
