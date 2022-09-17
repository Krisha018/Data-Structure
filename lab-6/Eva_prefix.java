import java.util.*;
class Evaluation_prefix
{
	int top=-1 ;
	int a[]= new int[50];
	int value;

	public void push(int c)
	{
		if(top>=50)
		{
			System.out.println("Stack Overflow");
		}
		else
		{
			top=top+1;
			a[top]=c;
		}
	}

	public  int pop()
	{
		if(top<0)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		else
		{
			top--;
			return a[top+1];
		}
	}

	public int operation(int op2,int op1,char y)
	{
			if(y=='+')
			{
				return(op1+op2);
			}
			else if(y== '-')
			{
				return(op1-op2);
			}
			else if(y=='*')
			{
				return(op1*op2);
			}
			else if(y=='/')
			{
				return(op1/op2);
			}
			else {
				return(op1^op2);
			}
			
		}
		public void evaluation(String str)
		{
			for(int i=str.length()-1;i>=0;i--)
			{
				boolean flag=Character.isDigit(str.charAt(i));
				if(flag)
				{
					push(Character.getNumericValue(str.charAt(i)));
				}
				else {
					value=operation(pop(),pop(),str.charAt(i));
					push(value);
				}
			}
			System.out.println("ans:"+value);
		}
	}
	public class Eva_prefix
	{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Expression");
			String expression=sc.nextLine();
			Evaluation_postfix a=new Evaluation_postfix();
			a.evaluation(expression);
		}
}