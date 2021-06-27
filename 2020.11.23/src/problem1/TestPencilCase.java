package problem1;

public class TestPencilCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pen pen1 = new Pen("blue");
		Pen pen2 = new Pen("red");
		Pencil pencil1 = new Pencil("graphic","HB");
		Pencil pencil2 = new Pencil("pink", "2B");
		Pencil pencil3 = new Pencil("graphic", "6B");
		PencilCase pencilCase = new PencilCase();
		pencilCase.addPen(pen1);
		pencilCase.addPen(pen2);
		pencilCase.addPencil(pencil1);
		pencilCase.addPencil(pencil2);
		pencilCase.addPencil(pencil3);
		pencilCase.removePencil(pencil1);
		System.out.println(pencilCase.isMediumPencil());
		System.out.println(pencilCase.isHardPencil());
		System.out.println(pencilCase.isPencilColor("graphic"));
		System.out.println(pencilCase.isPenColor("green"));
		pencilCase.addPen("green");
		System.out.println(pencilCase.getNumberOfPens());
	}

}
