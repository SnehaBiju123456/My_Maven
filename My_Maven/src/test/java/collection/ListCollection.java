package collection;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List ob=new ArrayList(); //non generic
		ob.add(32);
		ob.add("achuth");
		ob.add(7.6f);
		ob.add('e');
		System.out.println(ob);
		
		List<String> obj=new ArrayList();//generic
		obj.add("ab");
		obj.add("cd");
		obj.add("ef");
		System.out.println(obj);
		
		obj.remove(0);//remove
		System.out.println(obj);
		
		List<String> objt=new ArrayList();
		objt.add("gh");
		objt.addAll(obj);//add
		System.out.println(objt);
		
		objt.removeAll(objt);
		System.out.println(objt);
		
		System.out.println(obj.get(0));//get element of given index
		System.out.println(obj.size());//size of array
		
		boolean l=ob.contains("list");
		System.out.println(l);
		boolean j=ob.contains(7.6f);
		System.out.println(j);

	}

}
