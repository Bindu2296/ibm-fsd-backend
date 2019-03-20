
package assignments.CoreJava;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10,b=20;
System.out.println("Before swap a is "+a+" b is "+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After swap a is "+a+" b is "+b);

int x=50,y=60,z=0;
System.out.println("Before swap x is "+x+" y is "+y);
z=x;
x=y;
y=z;
System.out.println("After swap x is "+x+" y is "+y);

	}

}
