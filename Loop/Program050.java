/*
      Enter number of elements :
      5
      allocating is resources...
      Enter the element :
      1
      4
      5
      7
      2
      Enlemnet of the array are :
      1
      4
      5
      7
      2
      Number of Even Enlemnet of : 2

*/

import java.util.Scanner; 

class NNumberX
{
    public int Arr[];

    public NNumberX(int iSize)
    {
        System.out.println("allocating is resources...");

       Arr = new int[iSize];  // Resource allocation
    }

   /* protected void finalize()
    {
       System.out.println("Deallocating the resources...");
       Arr = null;
    }
*/
    public void Accept()
    {
       int iCnt = 0;

       Scanner sobj = new Scanner(System.in);

       System.out.println("Enter the element :" );
       for(iCnt = 0; iCnt < this.Arr.length; iCnt++)
       {
          this.Arr[iCnt] = sobj.nextInt();
       }

    }
    public void Display()
    {
        int iCnt = 0;

      System.out.println("Enlemnet of the array are :" );
        for(iCnt = 0; iCnt < this.Arr.length; iCnt++)
       {
        System.out.println(this.Arr[iCnt]);
       }
       
    }
 public int CountEven()
 {
    int iCount = 0, iCnt = 0;
    for(iCnt = 0; iCnt < Arr.length; iCnt++)
       {
          if((Arr[iCnt] % 2 == 0))
          {
            iCount++;
          }
       }
       return iCount; 
 }
}
   
class Program050
{
    public static void main(String A[])
    {

       Scanner sobj = new Scanner(System.in);
       
       System.out.println("Enter number of elements : ");
       int iSize = sobj.nextInt();
         
        NNumberX nobj = new NNumberX(iSize);

       nobj.Accept();
       
       nobj.Display();
      
       int iRet = 0;

       iRet = nobj.CountEven();

       System.out.println(" Number of Even Enlemnet of : "+iRet);
       
       sobj = null;

       System.gc();
    }

}