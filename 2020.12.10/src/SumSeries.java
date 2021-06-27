
public class SumSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double m=0;
		for(double i=1;i<=20;i++) {
			m+=(i/(i+2));
			System.out.printf("%d\t%7.4f\n", (int)i, m);
		}
	}

}
