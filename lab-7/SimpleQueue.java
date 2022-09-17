import java.util.*;
class implementqueue
{
	int s[] = new int [5];
	int f,r = -1;
	int n=5;

	public void Enqueue(int n)
	{
		if(r>=n-1)
		{
			System.out.println("Queue overflow");
		}
		else
		{
			r=r+1;
			s[r]=n;
			if(f==-1)
			{
				f=0;
			}
		}
	}
		public int Dequeue()
	{

		if(f==-1)
		{
			System.out.println("Queue underflow");
			return 0;
		}
		else
		{
			n=s[f];
			
			if(f==r)
			{
				f=0;
				r=0;
			}
			else 
			{
				f++;
			}
			System.out.println(n);
			return n;

		}
	}
	public void Display()
	{
		if(f==-1)
		{
			System.out.println("Queue underflow");
		}
		else 
		{                                                                                                                                              
			for(int i=f;i<=r;i++)
			{
				System.out.println(s[i]);
			}
		}
	}
}

public class SimpleQueue                                                                        
{
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
        implementqueue obj=new implementqueue();
        while(true){
          int x = sc.nextInt();
          switch(x){
          	
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

	





    
   