package Array;

public class TwoDarray {
	
public static void main(String[] args) {
	
	int[][]arr1 = {{1,2,3},{1,2,3},{1,2,3}};//direct intializing array

	///using new keyword
	int [][] arr = new int[2][2];
	arr[0][0] = 6;
	arr[0][1] = 5;
	arr[1][0] = 4;
	arr[1][1] = 3;
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(arr1[i][j]+" ");
		}
		System.out.println();
	}

	
	
	
}
}
