package labs.CoreJava;

public class LargestNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {10,20,30};
int x=0;
for(int i=1;i<a.length;i++) {
	if(x<=a[i]) {
		x=a[i];
	}x++;
	
}
System.out.println("Largest in array"+x);
	}

}
