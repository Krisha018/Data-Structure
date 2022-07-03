import java.util.*;
public class Prime
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int flag=0;
		for (int i=2;i<n ;i++ )
		 {
		 	if(n%i==0)
		 	{
		 		flag=1;
		 		break;
		 	}
			
		}
		if(flag==1)
		{
			System.out.println("NUmber is not Prime");
		}
		else
		{
			System.out.println("NUmber is  Prime");	
		}
	}
}