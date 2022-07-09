import java.util.*;
 class SwapTwoNumbers
{
	public static void swap(int n1,int n2)
	{
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
	System.out.println("n1"+n1);
	System.out.println("n2"+n2);
}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1");
		int n1=sc.nextInt();
		System.out.println("Enter n2");
		int n2=sc.nextInt();
		swap(n1,n2);
	}
}
