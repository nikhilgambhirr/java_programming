/*
          Input:-
               Enetr the  Number
               10
          Output:-     
               Sum of factor :18
               sum of non factors :37

*/
import java.util.*;

class Number 
{
    public void Sum(int iNo)
    {
       int iCnt = 0;
       int iSum1 = 0;
       int iSum2= 0;

       for(iCnt = 1; iCnt <= iNo; iCnt++)
       {
         if (( iNo % iCnt) != 0)
         {
              iSum1= iSum1+ iCnt;
         }
         else
         {
            iSum2 = iSum2 +iCnt;
         }
       }
         System.out.println("Sum of factor :"+iSum2);
         System.out.println("sum of non factors :"+iSum1);

    }
}
class  Program012

{
 
     public static void main(String A[])
    {
        
        
         Scanner sobj = new Scanner(System.in);

        System.out.println("Enetr the  Number");
           int iValue = sobj.nextInt();

         Number nobj = new Number();

         
         nobj.Sum(iValue);
    }
}