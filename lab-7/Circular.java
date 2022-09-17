import java.util.*;
class queue
{
	int s[] = new int [5];
	int front=-1,r = -1;
	int n;

public void Enqueue(int n)
{
	if(r==n)
	{
		r=0;
		if(front==0)
		{
			System.out.println("Overflow");
		}
		else 
		{
			s[r]=n;
		}
	}
	if(front==r && front!=0 && front!=-1)
	{
		System.out.println("Overflow");
	}
	else 
	{
		r++;
		s[r]=n;
		if(front==-1)
		{
			front=0;
		}
	}
}
public int Dequeue()
{
	if(front==-1)
	{
		System.out.println("Underflow");
	}
	n=s[front];
	if(front==n)
	{
		front=0;
	}
	else 
	{
		front++;
	}
	return n;
}

public void Display()
{
	if(front==-1)
	{
		
		System.out.println("Underflow");
		
	}
	else 
	{
		for (int i=front;i<=r;i++)
		{
			System.out.println(s[i]);
		}
	}
	}
}


public class Circular
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		queue obj=new queue();
		while(true)
		{
			int x = sc.nextInt();
			switch(x)
			{
				case 1:
                	System.out.println("Enter element for enqueue");
                	obj.Enqueue(sc.nextInt());
                	break;
                	 case 2:
                	System.out.println("Enter element for Dequeue");
                	obj.Dequeue();
                	break;
                case 3:
                	System.out.println("Enter element for Display");
                	obj.Display();
			}
		}
	}
}
