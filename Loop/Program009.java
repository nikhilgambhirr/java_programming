/*
        Input:-
              Enter number :
              12
        Output:-
               Summation of factors is 16

         Example:-
           icnt = 1
          12 % 1 = 0 → factor
          iSum = 0 + 1 = 1
           icnt = 2
          12 % 2 = 0 → factor
          iSum = 1 + 2 = 3
           icnt = 3
          12 % 3 = 0 → factor
          iSum = 3 + 3 = 6
           icnt = 4
          12 % 4 = 0 → factor
          iSum = 6 + 4 = 10
           icnt = 5
          12 % 5 = 2 → factor नाही
          iSum = 10 (same)
           icnt = 6
          12 % 6 = 0 → factor
          iSum = 10 + 6 = 16      


*/
import java.util.*;

class Number
{
      public int SumFactors(int iNo)
      {
        int icnt = 0, iSum = 0;
        for( icnt = 1; icnt <=( iNo / 2); icnt++)
        {
             if(( iNo % icnt) == 0)
             {
                iSum = iSum + icnt;
             }
             
        }
        return iSum;  
      }
}
  class Program009
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();

        int iRet = nobj.SumFactors(iValue);
        System.out.println("Summation of factors is "+iRet);
    }
}