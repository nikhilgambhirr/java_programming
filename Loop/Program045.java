// input : 
// output :

import java.util.Scanner;


class MarvellousString  
{
    public String str;   // charaterstic

    public MarvellousString(String a)
    {
         this.str = a;
    }

   public int CountSmall()     // corrate code
   {
       char Arr[] = str.toCharArray();

        int iCount = 0, iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
      {
          if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
          {
              iCount++;
          }

     }
     return iCount;
    }
   
   public String UpadtesString()
   {
     char Arr[] = str.toCharArray();

        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
      {
          if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
          {
              Arr[iCnt] = '#';
          }

     }
     String ret = new String(Arr);

     return ret;
    }
}
    
class Program045
{
    public static void main(String A[])
    {

       Scanner sobj = new Scanner(System.in);

       System.out.print("Please Enter String : ");
       String data = sobj.nextLine();

       MarvellousString mobj = new MarvellousString(data);

       

       String sRet = null;

       sRet = mobj.UpadtesString();

       System.out.println("Upadated String is :"+sRet);


    }

}