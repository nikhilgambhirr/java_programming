import java.util.Scanner;

import javax.imageio.ImageReadParam;

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
}
    
class Program044
{
    public static void main(String A[])
    {

       Scanner sobj = new Scanner(System.in);

       System.out.print("Please Enter String : ");
       String data = sobj.nextLine();

       MarvellousString mobj = new MarvellousString(data);

       

       int iRet = 0;

       iRet = mobj.CountSmall();

       System.out.println("Number of small charaters are :"+iRet);


    }

}