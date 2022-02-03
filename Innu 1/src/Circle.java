import java.io.*;
public class Circle {
	 public static void main(String args[])throws IOException
	 { 
	 System.out.println("Enter the Radius"); 
	 InputStreamReader r = new InputStreamReader(System.in); 
	 BufferedReader b = new BufferedReader(r); 
	 String s = b.readLine(); 
	 double radius = Double.parseDouble(s); 
	 double area = 3.14*radius*radius; 
	 double perimeter = 2*3.14*radius; 
	 System.out.println("Radius of the Circle: "+radius); 
	 System.out.println("Area of the Circle: "+area); 
	 System.out.println("Perimeter of the Circle: "+perimeter); 
	 } 
	 } 

