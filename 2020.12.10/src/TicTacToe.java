import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

	private static Row row;
	private static Column column;
	private static Scanner sc = new Scanner(System.in);
	private static boolean isX = true;
	private static XO[] values= new XO[9];
	
	private static enum XO{
		X, O;
		private static void change(XO xo) {
			if(xo==XO.O) {
				xo=XO.O;
			}else {
				xo=xo.X;
			}
		}
	}
	private static enum Row{
		ZERO,ONE,TWO;
		 static void set(int row) {
			switch (row) {
			case 0:
				TicTacToe.row = ZERO;
				break;
			case 1:
				TicTacToe.row = ONE;
				break;
			case 2:
				TicTacToe.row = TWO;
				break;
			}
		}
	}
	private static enum Column{
		ZERO,ONE,TWO;
		 static void set(int column) {
			switch (column) {
			case 0:
				TicTacToe.column = ZERO;
				break;
			case 1:
				TicTacToe.column = ONE;
				break;
			case 2:
				TicTacToe.column = TWO;
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printTable();
		setParameters();
	}

	public static boolean changeOrder() {
		isX = !isX;
		return isX;
	}
	public static XO order() {
		if(isX) return XO.X;
		else return XO.O;
	}
	
	public static void setParameters(){
		System.out.print("Enter a row(0, 1 or 2) for player "+ (isX ? "X: ":"O: "));
		int row = sc.nextInt();
		int column=0;
		if(row>2||row<0) {
			System.out.println("Wrong input");
			setParameters();
		}else {
			Row.set(row);;
			column = setColumn();
		}
		int index = 3*row+column;
		if(values[index]==XO.O||values[index]==XO.X) {
			System.out.println("Filled cell. Choose another position!");
			setParameters();
		}else {
			values[index] = order();
		}
		printTable();
		changeOrder();
		if(!result()) setParameters();
	}
	public static int setColumn(){
		System.out.print("Enter a column(0, 1 or 2) for player "+ (isX ? "X: ":"O: "));
		int column = sc.nextInt();
		if(column>2||column<0) {
			System.out.println("Wrong input");
			setColumn();
		}else {
			Column.set(column);;
		}
		return column;
	}
	public static void printTable() {
		System.out.println(".............");
		for(int i=0;i<3;i++) {
			System.out.print("| ");
			for(int j=0;j<3;j++) {
				if(values[3*i+j]==null) System.out.print("  ");
				else System.out.print(values[3*i+j]+" ");
				System.out.print("| ");
			}
			System.out.println();
			System.out.println(".............");
		}

		System.out.println();
	}
	public static boolean result() {
		for(int i=0;i<3;i++) {
			if(values[3*i]==values[3*i+1]&&values[3*i+2]==values[3*i+1]&&values[3*i]!=null) {
				System.out.println(values[3*i]+" player won");
				return true;
			}
		}
		for(int j=0;j<3;j++) {
			if(values[j]==values[3+j]&&values[6+j]==values[3+j]&&values[j]!=null) {
				System.out.println(values[j]+" player won");
				return true;
			}
		}
		if(values[0]==values[4]&&values[4]==values[8]&&values[0]!=null) {
			System.out.println(values[0]+" player won");
			return true;
		}
		if(values[2]==values[4]&&values[4]==values[6]&&values[2]!=null) {
			System.out.println(values[2]+" player won");
			return true;
		}
		if(values[0]!=null && values[1]!=null && values[2]!=null && values[3]!=null && values[4]!=null && values[5]!=null && values[6]!=null && values[7]!=null && values[8]!=null) {
			System.out.println("Draw!");
			return true;
		}
		return false;
	}
}
