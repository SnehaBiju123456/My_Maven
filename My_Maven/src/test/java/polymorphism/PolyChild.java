package polymorphism;

public class PolyChild extends ParentPolymor{
	final int a=2;
	//@Override
	public void display()
	{
		super.display();
		System.out.println("child class");
		//a=19;final is used value can not be changed ,it is constant
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyChild ob=new PolyChild();
		ob.display();
		//ParentPolymor obj=new ParentPolymor(); using is-a relationship
		//obj.display();

	}

}
