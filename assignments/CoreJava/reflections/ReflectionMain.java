package labs.CoreJava.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class<?> c= ReflectionEx.class;
	//Class<?> c1= Class.forName("com.examples.core.java.ReflectionEx");
	
	System.out.println(c);
	Constructor<?> constr =c.getConstructor();
	System.out.println(constr);
	
	Object obj =constr.newInstance();
	
	Method add= c.getMethod("add", Integer.class,Integer.class);
	Object x= add.invoke(obj,5, 6);
	System.out.println(x);
	
}catch (Exception e) {
	// TODO: handle exception
	
	e.printStackTrace();
}

		
		
	}

}
