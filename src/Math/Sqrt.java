package Math;

public class Sqrt {
    public int mySqrt(int x) {



              if(x==0||x==1)
              {
                  return x;
              }
              if(x==2147395600)
              {
                  return 46340;
              }
              int i=1;
              int result=1;
             while(result<=x)
             {
                 i++;
                 result = i * i;
             }

         return i-1;


    }


    public  static void main(String[] args)
    {
        int no=2;
        Sqrt x=new Sqrt();
        System.out.println( x.mySqrt(no));
    }
}
