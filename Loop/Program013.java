/*
             Input:-
                    Enter the  Number
                    10
            Output:-        
                    Number of digits are :2
*/
import java.util.*;

class Digits
{
    public int CountDigits(int iNo)
    {
       int  iDigits = 0;
       int iCnt = 0;
       while (iNo > 0)
       {
          iDigits = iNo % 10;
           iCnt ++;
           iNo = iNo /10;
       }
    
     return iCnt;
        
       
    }

}
class Program013
{
    public static void main(String A [])
    {
          Scanner sobj = new Scanner(System.in);

          System.out.println("Enter the  Number");
          int iValue = sobj.nextInt();

          Digits dobj = new Digits();
          int iRet = dobj.CountDigits(iValue);

           System.out.println("Number of digits are :"+iRet);

    }
}