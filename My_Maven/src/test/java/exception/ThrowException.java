package exception;

public class ThrowException {
	public static void test(int age) 
	{
		if(age<18)
		{
			throw new ArithmeticException("not eligible");
		}
		else
		{
			System.out.println("eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowException.test(3);
		System.out.println("end");

	}

}
