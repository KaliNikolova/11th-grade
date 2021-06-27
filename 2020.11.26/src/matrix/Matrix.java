package matrix;
import java.util.Scanner;;

public class Matrix {

	private int rows;
	private int columns;
	private int[][] elements;
	Scanner sc = new Scanner(System.in);
	
	public Matrix(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		elements = new int[rows][columns];
	}
	
	public int getNumberOfRows() {
		return rows;
	}
	public int getNumberOfColumns() {
		return columns;
	}
	public void setElements(int i, int j) {
		if(i>=0&&i<rows&&j>=0&&j<columns) {
			System.out.print("Set the element in position ["+i+"]["+j+"]: ");
			elements[i][j] = sc.nextInt();
		}else System.out.println("Error");
	}
	public void setAllElements() {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print("Set the element in position ["+i+"]["+j+"]: ");
				elements[i][j] = sc.nextInt();
			}
		}
	}
	public void printMatrix() {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(elements[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static Matrix addMatrix(Matrix m1, Matrix m2){
		int[][] a = m1.elements;
		int[][] b =m2.elements;
		if(a.length!=b.length||a[0].length!=b[0].length) {
			System.out.println("Matrices cannot be added");
			return null;
		}
		int row=a.length;
		int column = a[0].length;
	    Matrix m = new Matrix(row, column);
	    for(int i=0;i<row;i++){
	      for(int j=0;j<column;j++){
	        m.elements[i][j] = a[i][j]+b[i][j];
	      }
	    }
	    return m;
	  }
	  public static Matrix multiplyMatrix(Matrix m1, Matrix m2){
		int[][] a = m1.elements;
		int[][] b =m2.elements;
		if(a.length!=b.length||a[0].length!=b[0].length) {
			System.out.println("Matrices cannot be multiplied");
			return null;
		}
		int row=a.length;
		int column = a[0].length;
	    Matrix m = new Matrix(row, column);
	    for(int i=0;i<row;i++){
	      for(int j=0;j<column;j++){
	        for(int k=0;k<Math.min(row,column);k++){
	          m.elements[i][j] += (a[i][k]*b[k][j]);
	        }
	      }
	    }
	    return m;
	  }
}
