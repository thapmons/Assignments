package question37;

public class MatrixOperation {

	public static void main(String[] args) {
		int[][] matrixA= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] matrixB= {{4,5,6},{2,7,8},{3,1,9}};
		int[][] matrix =new int[3][3];
		System.out.println("The resultant matrix is: ");
		for (int i = 0; i < 3 ; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j]=matrixA[i][j]+matrixB[i][j];
				System.out.print(matrix[i][j]+ " ");
				
			}
			System.out.println();
		}
	}

}
