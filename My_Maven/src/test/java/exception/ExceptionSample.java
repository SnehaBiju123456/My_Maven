package exception;

public class ExceptionSample {
	public void display()
	{
		int a=12;
		try {
		int b=a/0;//arithmetic
		System.out.println(b);
		}
		catch(Exception e)
		{
			System.out.println("exception handled");
			System.out.println(e);
		}
		finally {
			System.out.println("finally");
		}
		
		
		
		/*int arr[]= {1,2,3,4};
		System.out.println(arr[1]);
		try
		{
			System.out.println(arr[5]);//out of bound 
		}
		catch(Exception r)
		{
			System.out.println("Exception Handled");
			System.out.println(r);
		}
		
		
		
		String s=null;
		System.out.println(s);
		try {
		System.out.println(s.length());//null pointer
		}
		catch(Exception y)
		{
			System.out.println("Exception handled");
			System.out.println(y);
		}*/
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionSample obj=new ExceptionSample();
		System.out.println("end");
		obj.display();
		//System.out.println("end");
		
		

	}

}
