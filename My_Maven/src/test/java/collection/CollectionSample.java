package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionSample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ob=new ArrayList();//non generic
		ob.add(1);
		ob.add("sneha");
		ob.add(2.4f);
		ob.add(123.4d);
		System.out.println(ob);
		
		ArrayList<String> obj=new ArrayList(); //generic
		obj.add("annu");
		obj.add("anna");
		obj.add("neha");
		obj.add("anitha");
		System.out.println(obj);
		
		obj.remove(0);// remove 
		System.out.println(obj);
		
		ArrayList<String> objt=new ArrayList();//generic method
		objt.add("aaliya");
		objt.add("varsha");
	    objt.addAll(obj);//addAll
		System.out.println(objt);
		
		objt.removeAll(objt);//remove 
		System.out.println(objt);
		
		System.out.println(obj.get(0));//get given index element
		
		System.out.println(obj.size());//size of list
		
		boolean f=obj.contains("anna");//contain (if present true not present false)
		System.out.println(f);
		boolean h=obj.contains("hi");
		System.out.println(h);
		
		Iterator itr=ob.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		itr.remove();
		System.out.println(ob);
		
		

	}

}
