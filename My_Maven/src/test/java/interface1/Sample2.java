package interface1;

public class Sample2 implements Sample1{
	public void add()
	{
		System.out.println(a+b);
	}
	public void display()
	{
		System.out.println("interface");
	}
	public void print()
	{
		System.out.println("method in class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sample2 ob=new Sample2();
		Sample1 obj=new Sample2();
		//ob.add();
		//ob.display();
		//ob.print();
		obj.add();
		obj.display();
		//obj.print();
		

	}

}
