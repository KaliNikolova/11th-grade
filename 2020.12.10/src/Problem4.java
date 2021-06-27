
public class Problem4 {
	
	private enum Currency{
		TWO, FIVE, TEN, TWENTY, FIFTY, HUNDRED;
		private void descriprion() {
			switch(this) {
			case TWO:
				System.out.println("Two leva");
				break;
			case FIVE:
				System.out.println("Five leva");
				break;
			case TEN:
				System.out.println("Ten leva");
				break;
			case TWENTY:
				System.out.println("Twenty leva");
				break;
			case FIFTY:
				System.out.println("Fifty leva");
				break;
			case HUNDRED:
				System.out.println("One hundred leva");
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(Currency currency: Currency.values()) {
			System.out.printf("%s %s %3s\t",currency.toString() , currency.ordinal(),"");
			currency.descriprion();
		}
	}

	
}
