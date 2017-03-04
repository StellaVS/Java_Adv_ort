package pattern_strategy_03_17;

public class SilverClient implements SystemOfDiscounts {

	@Override
	public double discountPayment(double sum, int percent) {

		return sum / 100 * (percent + 3);
		
	}

}
