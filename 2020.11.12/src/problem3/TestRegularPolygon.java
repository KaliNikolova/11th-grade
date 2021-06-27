package problem3;

public class TestRegularPolygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon[] p=new RegularPolygon[3];
		p[0] = new RegularPolygon();
		p[1] = new RegularPolygon(3,14.4);
		p[2] = new RegularPolygon(4, 10, 3.76,2.9);
		for(int i=0;i<3;i++) {
		System.out.println("Poligon "+(i+1)+" has area "+p[i].getArea()+" and perimeter "+p[i].getPerimeter());
		}
	}

}
