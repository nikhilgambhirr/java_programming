import java.util.Scanner;

import javax.imageio.ImageReadParam;

class MarvellousString  
{
    public String str;   // charaterstic
   public int CountSmall()
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
    
class Program043
{
    public static void main(String A[])
    {

       Scanner sobj = new Scanner(System.in);

       System.out.print("Please Enter String : ");
       String data = sobj.nextLine();

       MarvellousString mobj = new MarvellousString();

       mobj.str = data;  // as kraych nay  he wrong ahe

       int iRet = 0;

       iRet = mobj.CountSmall();

       System.out.println("Number of small charaters are :"+iRet);


    }

}