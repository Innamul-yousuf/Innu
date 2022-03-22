//3. Uneven multiarr
public class unevenmultiarr {
public static void main(String[] args) {
	int uneven1[][]= {
			{1,2,3,4},
			{5,6,7,8,9,10},
			{1,2,3,4},
			{5,6}
	};
	int uneven[][]=new int[4][];
	uneven[0]=new int[5];
	uneven[1]=new int[1];
	uneven[2]=new int[2];
	uneven[3]=new int[3];
	
	
	for(int row[]:uneven) {
		for(int val:row) {
			System.out.print(val+"\t");
		}
		System.out.println();
	}
	
	
	}
}
