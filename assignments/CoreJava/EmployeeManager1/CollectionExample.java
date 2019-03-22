package assignments.CoreJava.EmployeeManager1;
import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;
public class CollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector x = new Vector();
//Collection x=new Vector();
//
x.add("Sia");
x.add("Dan");
x.add("Dean");

List clist=new ArrayList();
clist.add("Sia");
clist.add("Mia");
clist.add("Anna");
clist.add("Suz");
 Iterator a=(Iterator) clist.iterator();

System.out.println(x);

for(Object item:x)
{
	System.out.println(item);
}
x.remove(1);


System.out.println(x.size());
System.out.println(x);

Object[] arr=x.toArray();
System.out.println(arr.length);


}

}
