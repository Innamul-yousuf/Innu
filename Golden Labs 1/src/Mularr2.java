
//2. Multi dim arr
public class Mularr2 {
public static void main(String[] args) {
int mul[][]= {
		{1,2,3,4},
		{5,6,7,8},
		{1,2,3,4},
		{5,6,7,8}
};
/*mul[0]=new int[0];
mul[1]=new int[1];
mul[2]=new int[2];
mul[3]=new int[3];*/
System.out.println("...................../n/n\n");
for(int i=0;i<mul.length; i++) {
	for(int j=0;j<mul[i].length;j++) {
		System.out.print(mul[i][j]+"\t");
		
	}
	
	System.out.println();
	}
System.out.println("...................../n/n\n");
for(int row[]:mul) {
	for(int j:row) {
		System.out.print(j+"\t");
	}
	System.out.println();
}
}
}
