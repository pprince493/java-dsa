package TwoDArrays;

public class SpiralMatrix {
	public static void main(String args[]) {
		int matrix[] [] = {{1,2,3,4},
							{5,6,7,8},
							{9,10,11,12},
							{13,14,15,16}};
		printSpiral(matrix);
	}
	
	public static void printSpiral(int matrix[][]) {
		int n=matrix.length;
		int m=matrix[0].length;;
		int startRow=0;
		int startCol=0;
		int endRow=n-1;
		int endCol=m-1;
		
		System.out.print("Spiral matrix is -> ");
		while(startRow <= endRow && startCol <= endCol) {
			// top row
			for(int j=startCol;j<endCol;j++) {
				System.out.print(matrix[startRow][j]+",");
			}
			// Right Column
			for(int i=startRow;i<=endRow; i++) {
				if(startRow == endRow) {
					break;
				}
				System.out.print(matrix[i][endCol]+",");
			}
			for(int i=endCol-1;i>=startCol; i--) {
				
				System.out.print(matrix[endRow][i]+",");
			}
			
			for(int i=endRow-1;i>=startRow; i--) {
				if(startCol == endCol) {
					break;
				}
				
				System.out.print(matrix[i][startCol]+",");
			}
			
			startRow ++;
			endRow --;
			startCol ++;
			endCol --;
			
		}
		System.out.println("");
	}
}
