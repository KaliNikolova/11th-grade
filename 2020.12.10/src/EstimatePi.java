
public class EstimatePi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<1000;i+=100) {
			System.out.printf("%d\t%.4f\n",i,m(i));
		}
			}

	public static double m(int i) {
		double m=0;
		for(int j=1; j<=i; j++) {
			m+=4*Math.pow(-1, j+1)/(2*j-1);
		}
		return m;
	}
}
