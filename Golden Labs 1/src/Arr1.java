//1. program for Arr
public class Arr1 {
	public static void main(String[] args) {
		
int month0[];
int month[]=new int[10];
int month1[]=new int[12];
int length=month.length;

for(int i=0; i<length ;i++) {
	System.out.println(month[i]+"/t");
	}
for(int i:month) {
	System.out.println(i+"\t");
	}
String month2[]=new String[12];
month2[0]="jan";
month2[1]="feb";
month2[2]="march";
month2[3]="april";
for(String s: month2) {
	System.out.println(s+"\t");
	
}
}
}