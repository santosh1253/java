import java.util.*;
public class largePrime{
    public static void main(String args[]) {
      Scanner s=new Scanner(System.in);
      long n=s.nextLong();
	  long max=Integer.MIN_VALUE;
       for(long i=1;i<=Math.sqrt(n);i++)
	   {
		   if(n%i==0)
		   {
			 if(n/i==i)
			 {
				 if(isprime(n/i)==1&& (n/i)>max)   max=n/i;
			 }
		     else
		     {
				if(isprime(n/i)==1&& (n/i)>max)   max=n/i;
				if(isprime(i)==1&& (i)>max)   max=i;
		     }
		   }
	   }
	   System.out.println(max);
    }
	public static int isprime(long n)
	{
		if(n<=1) return 0;
		else if(n==2) return 1;
		else if(n%2==0) return 0;
		for(long i=3;i*i<=n;i+=2)
		{
			if(n%i==0)
				return 0;
		}
		return 1;
	}
}