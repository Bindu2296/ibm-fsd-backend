package labs.CoreJava.collections;
import java.util.*;

import labs.CoreJava.generics.Employees1;


public class HashSetExample implements Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet  hset= new HashSet();
hset.add("strgf");
hset.add("asdadd");
hset.add("Sia");
System.out.println(hset);
System.out.println(hset.hashCode());
hset.add("Sia");
hset.add("Mia");
Iterator i=hset.iterator();
System.out.println(i.hasNext());

System.out.println(hset);
hset.add("Mia");


while(i.hasNext()) {
System.out.println(i.next());
	}
System.out.println(i.hasNext());

//Adding objects to hashSet
HashSet  nset= new HashSet();
nset.add(new Employees1(1,"sia", 12, "CSE", 120000));
nset.add(new Employees1(2,"Moia", 25, "Clouds", 25000));
nset.add(new Employees1(3,"Rita", 23, "CSE", 56000));

nset.add(new Employees1(4,"Anna", 36, "CSE", 34000));
for(Object emp:nset) {
	System.out.println(emp+""+emp.hashCode());
}


while(i.hasNext()) {
System.out.println(i.next());
	}

    
TreeSet tset=new TreeSet();

Employees1 e=new Employees1(1,"sia", 12, "CSE", 120000);
Employees1 e1=new Employees1(2,"Moia", 25, "Clouds", 25000);
Employees1 e2=new Employees1(3,"Rita", 23, "CSE", 56000);

Employees1 e3=new Employees1(4,"Anna", 36, "CSE", 56000);
tset.add(e);
tset.add(e1);
tset.add(e2);
System.out.println(tset+""+tset.hashCode());

	}
	
	




	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if (o1 instanceof Employees1 && o2 instanceof Employees1) {
			return ((Employees1) o1).getAge() - ((Employees1) o2).getAge();
		}
		
		return 0;
	}
	

	
	



}
