package exception;

public class Sample {
	public void test(int age) throws LicenseException
	{
		if(age<18)
		{
			throw new LicenseException("not eligible");
		}
		else
		{
			System.out.println("eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample ob=new Sample();
		try {
			ob.test(3);
		} catch (LicenseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//also a printing stmt
		}

	}

}
