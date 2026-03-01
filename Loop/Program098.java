import java.util.*;

class Matrix
{
     public int Arr[][];

     public Matrix(int A, int B)
     {
        Arr = new int [A][B];
     } 
}
class Program097
{
    public static void main(String A[] ) 
    {
        Matrix mobj = new Matrix(4, 03);

        System.out.println(mobj.Arr.length);
        System.out.println(mobj.Arr[0].length);

        
    }
}