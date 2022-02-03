//Super paa !!!
import java.util.Scanner;
public class Ebbill {
	public static void main (String[] arg){
	int Rs=0, units=0, total;
	Scanner reader = new Scanner(System.in);
	System.out.print("Enter the LMR:");
	int lmr = reader.nextInt();
	System.out.print("Enter the CMR:");
	int cmr = reader.nextInt();
	if(cmr>lmr)
	{
	units = cmr - lmr;
	}
	else
	{
	System.out.print("always enter cmr value greater than lmr:");
	System.exit(0);
	}
	if(units >= 300)
	{
	Rs = 5;
	}
	else if(units >= 200)
	{
	Rs = 4;
	}
	else
	{
	Rs = 2;
	}
	total = units * Rs;
	System.out.println("\nTotal amt of EB BILL="+total);
	System.out.println("CMR: "+cmr);
	System.out.println("LMR: "+lmr);
	System.out.println("Units: "+units);
	}
	}
