package operationsOnStack_29;

public class Stack_Operations 
{ 
	static final int MAX = 1000; 
	int top; 
	int a[] = new int[MAX];  
	boolean isEmpty() 
	{ 
		return (top < 0); 
	} 
	Stack_Operations() 
	{ 
		top = -1; 
	} 
	boolean push(int x) 
	{
		if (top >= (MAX-1)) 
	    { 
			System.out.println("Stack Overflow"); 
			return false; 
	    } 
		else
		{ 
			a[++top] = x; 
			System.out.println(x + " is pushed into stack"); 
			return true; 
		} 
	} 
	int pop() 
	{ 
		if (top < 0) 
		{
			System.out.println("Stack Underflow"); 
			return 0; 
		} 
		else
		{ 
			int x = a[top--]; 
			return x; 
		} 
	} 
	
	public static void main(String args[])
	{
		Stack_Operations s = new Stack_Operations(); 
		s.push(20); 
		s.push(10); 
		s.push(90); 
		System.out.println(s.pop() + " is Popped from stack"); 
	}
} 	