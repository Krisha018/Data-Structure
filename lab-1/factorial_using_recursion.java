import java.util.*;
public class factorial_using_recursion
{
	public static void  main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		System.out.println(fact(num));

		
	}
	static int fact(int num)
	{
		if(num>=1)
		{
			return  num * fact(num-1);
		} 
		else 
		{
			return 1;
		}
	}
}
