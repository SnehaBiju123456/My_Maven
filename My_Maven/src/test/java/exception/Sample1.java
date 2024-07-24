package exception;

public class Sample1 {
	public void print(int age) throws VoterIdException
	{
		if(age<18)
		{
			throw new VoterIdException("not eligible for vote");
		}
		else
		{
			System.out.println("eligible for vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 ob=new Sample1();
		try {
			ob.print(4);
		} catch (VoterIdException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
