import java.util.Scanner;

class circledemo {
	double area=0, circum=0;
	double pie=3.14;
	Scanner reader=new Scanner(System.in);
	double r=reader.nextDouble();
void findarea() {
	area=pie*r*r;
	circum=2*pie*r;	
}
void displayarea() {
	System.out.println("Area of the circle;");
	System.out.println(area);
	System.out.println("Circumference of the circle:");
	System.out.println(circum);
}
}
public class circle {
public static void main(String[] args) {
	System.out.println("Enter the radius");
	
	circledemo x=new circledemo();
	x.findarea();
	x.displayarea();
	
}
}
