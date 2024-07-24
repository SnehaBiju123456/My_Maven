package exception;

public class nullPointException {
	public void print()
	{
	String f=null;
	try {
	System.out.println(f.length());
	}
	catch(Exception d){
		System.out.println("exception handled");
		System.out.println(d);
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nullPointException ob=new nullPointException();
		//System.out.println("null");
		ob.print();

	}

}
