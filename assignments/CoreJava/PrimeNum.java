package assignments.CoreJava;

public class PrimeNum {

	public static void main(String args[]){    
		  int i,m=0,flag=0;      
		  int n=3;//it is the number to be checked    
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }
int x,y=25;
System.out.println("Prime nos from 0 to" + y);
for(i=1;i<=y;i++) {
	for(x=i;x<=y;x++) {
		if(x%i!=0) {
			System.out.println(x);
		}
	}
}
		}    
}
