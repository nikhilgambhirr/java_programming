 /*           Input:-
                    Enetr the  Number
                    10
          NonFactors:-     
                    3
                    4
                    6
                    7
                    8
                    9




*/
import java.util.*;

class Number 
{
    public void DisplayNonFactors(int iNo)
    {
       int iCnt = 0;
       
       
       for(iCnt = 1; iCnt <= iNo; iCnt++)
       {
         if (( iNo % iCnt) != 0)
         {
              System.out.println(iCnt);
         }
         
       }
    }
}
class  Program010

{
 
     public static void main(String A[])
    {
        
        
         Scanner sobj = new Scanner(System.in);

        System.out.println("Enetr the  Number");
           int iValue = sobj.nextInt();

         Number nobj = new Number();
         nobj.DisplayNonFactors(iValue);
    }
}