// input : 
// output :

import java.util.Scanner; 

class NNumberX
{
 public int CountEven(int Arr[])
 {
    int iCount = 0, iCnt = 0;
    for(iCnt = 0; iCnt < Arr.length; iCnt++)
       {
          if((Arr[iCnt] % 2 == 0))
          {
            iCount++;
          }
       }
       return iCount; // e
 }
}
   
class Program046
{
    public static void main(String A[])
    {

       Scanner sobj = new Scanner(System.in);
       
       System.out.println("Enter number of elements : ");
       int iSize = sobj.nextInt();

       int Arr[] = new int[iSize];
       int iCnt = 0;

       System.out.println("Enter the element :" );
       for(iCnt = 0; iCnt < Arr.length; iCnt++)
       {
        Arr[iCnt] = sobj.nextInt();
       }

       System.out.println("Enlemnet of the array are :" );
       for(iCnt = 0; iCnt < Arr.length; iCnt++)
       {
        System.out.println(Arr[iCnt]);
       }
       
       NNumberX nobj = new NNumberX();

       int iRet = 0;
       iRet = nobj.CountEven(Arr);
       System.out.println(" Number of even element are : "+iRet);
       
       
       Arr = null;
       sobj = null;
    }

}