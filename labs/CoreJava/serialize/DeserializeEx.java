package labs.CoreJava.serialize;

import java.io.*;
public class DeserializeEx {

   public static void main(String [] args) {
      EmployeesNew e = null;
      try {
         FileInputStream fileIn = new FileInputStream("D:\\Java\\employee.txt");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         e = (EmployeesNew) in.readObject();
         in.close();
         fileIn.close();
      } catch (IOException i) {
         i.printStackTrace();
         return;
      } catch (ClassNotFoundException c) {
         System.out.println("Employee class not found");
         c.printStackTrace();
         return;
      }
      
      System.out.println("Deserialized Employee...");
      System.out.println("Name: " + e.name);
      System.out.println("Address: " + e.address);
      System.out.println("SSN: " + e.SSN);
      System.out.println("Id: " + e.id);
   }
}