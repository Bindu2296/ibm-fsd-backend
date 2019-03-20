package labs.CoreJava.serialize;

import java.io.*;

public class SerializeEx {

	public static void main(String[] args) {
		EmployeesNew e = new EmployeesNew();
		e.name="Reyan Ali";
		e.address = "Phokka Kuan, Ambehta Peer";
		e.SSN = 11122333;
		e.id=101;

		try {
			FileOutputStream fileOut = new FileOutputStream("D:\\Java\\employee.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in D:\\Java\\employee.txt");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}
