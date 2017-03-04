package pattern_strategy_03_17;

public class PlatinumClient implements SystemOfDiscounts {

	@Override
	public double discountPayment(double sum, int percent) {
		
		return sum / 100 * (percent + 15);
	}

}
