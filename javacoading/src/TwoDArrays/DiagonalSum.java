package TwoDArrays;

public class DiagonalSum {
	public static void main(String args[]) {
		int matrix[][] = {{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16}};
		diagonalSum(matrix);
	}
	
	public static void diagonalSum(int matrix[][]) {
		int pd= 0;
		int sd=0;
		int row = 0;
		int col=0;
		int sdRow = matrix.length - 1;
		int sdCol =0;
		while( row < matrix.length && col <matrix[0].length ) {
			pd += matrix[row][col];
			row ++;
			col ++;
		}
		while(sdRow >= 0 && sdCol < matrix.length) {
			if(sdRow == sdCol) {
				sdRow--;
				sdCol ++;
			}else {
			sd += matrix[sdRow][sdCol];
			sdRow--;
			sdCol ++;
			}
		}
		
		System.out.print("Diagonal sum = " + (pd + sd));
		
		
	}

}
