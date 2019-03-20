
	package assignments.CoreJava.oops;

	public class Contractr extends Person {

		static int id;
		String dept;
		int duration;


	public Contractr(int age,String dept,int duration,String name){
		//System.out.println(id);
		super(name,age);
	this.dept=dept;
	this.duration=duration;
	id++;
			
		}
		
		
		public void printDetails() {
		System.out.println("Contacters details name:"+getName()+" Contactr id:"+id+" age:"+getAge()+" dept:"+dept+" DurationInMonths:" +duration);	
		}
		
		
	}


	

