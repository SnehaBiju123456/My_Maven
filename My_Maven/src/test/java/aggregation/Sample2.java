package aggregation;

public class Sample2 {
	public void print()
	{
		System.out.println("class2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 obj=new Sample1();//aggregation
		obj.display();
		Sample2 ob=new Sample2();
		ob.print();

	}

}
