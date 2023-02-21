import java.util.*;
class cal
{
	public static void main(String args[])
	{
    Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int num=1;
	int c=0;
	int x=0;
	while(c<n)
	{
		x++;
		num+=1;
		if(isprime(num)==1)
		{
			c++;
		}
		
	}
	System.out.println(x);
	System.out.println(num);
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