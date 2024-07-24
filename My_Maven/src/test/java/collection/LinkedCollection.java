package collection;

import java.util.LinkedList;

public class LinkedCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ob=new LinkedList(); //non generic
		ob.add(2);
		ob.add("aarcha");
		ob.add(2.4f);
		ob.add(134.4d);
		System.out.println(ob);
		
		ob.remove(2);//remove 2nd index element
		System.out.println(ob);
		
		LinkedList <String> obj=new LinkedList();//generic method
		obj.add("null");
		obj.add("anu");
		obj.add("devu");
		obj.add("drish");
		System.out.println(obj);
		
		obj.remove(3);//removed index 3 element
		System.out.println(obj);
		
		LinkedList <String> objt=new LinkedList();
		objt.add("vichu");
		objt.add("vikki");
		
		objt.addAll(obj);
		System.out.println(objt);//addall obj + objt elements
		
		objt.removeAll(objt);//removed all elements
		System.out.println(objt);
		
		System.out.println(obj.get(0));
		System.out.println(obj.size());
		
		boolean s=obj.contains("drish");
		System.out.println(s);
		boolean d=obj.contains("devu");
		System.out.println(d);
		boolean k=ob.contains("aarcha");
		System.out.println(k);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
