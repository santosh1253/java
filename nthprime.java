import java.util.*;
public class nthprime {
    public static void main(String args[]) {
      Scanner s=new Scanner(System.in);
	  int sc=s.nextInt();
      int n=sc*sc;
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
      ArrayList<Integer> al=new ArrayList<>();
      for(int i=2;i<=n;i++)
         {
             if(a[i]==1)
             {
               al.add(i);
             }
         }
		  System.out.println(al.size());
         System.out.println(al.get(10000));
    }
}