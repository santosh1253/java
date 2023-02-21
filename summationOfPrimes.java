import java.util.*;
public class summationOfPrimes {
    public static void main(String args[]) {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n+1];
      for(int i=0;i<=n;i++)
          a[i]=1;
      for(int i=2;i*i<=n;i++)
      {
          if(a[i]==1)
          {
           for(int j=i*i;j<=n;j+=i )
           {
               a[j]=0;
           }
          }
      }
      long sum=0;
      for(int i=2;i<=n;i++)
         {
             if(a[i]==1)
             {
               //System.out.println(i);
                sum+=i;
             }
         }
         System.out.println(sum);
    }
}