//___India___is__my_country_____
// After trim
// India____is__my_country

import java.util.*; 

class Program080
{
     public static void main(String A[] ) 
     {
           Scanner sobj = new Scanner(System.in);
           
           System.out.println("Enter the String");

           String str= sobj.nextLine();

           str = str.trim();

           char Arr[] = str.toCharArray();
           char Brr[] = new char[Arr.length];

           int iCount = 0, i = 0, j = 0;
           boolean bFlag = false;
           

           for(i = 0; i < Arr.length; i++)
           {
               if(Arr[i] != ' ')
               {
                 Brr[j] = Arr[i];
                 j++;
                 bFlag = false;
               }
               else if(Arr[i] == ' ')
               {
                   if(bFlag == false)
                   {
                      Brr[j] = ' ';
                      j++;
                      bFlag = true;
                   }
               }
           }
           String output = new String(Brr);

           output = output.trim();
           System.out.println("Upated String are  : "+output);
           System.out.println("Length is  : "+output.length());

     }
}