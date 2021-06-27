package matrix;

public class TestMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Matrix m1 = new Matrix(2, 3);
		Matrix m2 = new Matrix(2, 3);
		System.out.println(m1.getNumberOfColumns());
		System.out.println(m2.getNumberOfRows());
		m1.setAllElements();
		m2.setAllElements();
		m2.setElements(2, 7);
		m2.setElements(1, 2);
		m1.printMatrix();
		m2.printMatrix();
		Matrix add = Matrix.addMatrix(m1, m2);
		add.printMatrix();
		Matrix mul = Matrix.multiplyMatrix(m1, m2);
		mul.printMatrix();
	}

}
