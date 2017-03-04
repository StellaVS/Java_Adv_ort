package pattern_strategy_03_17;
/**
 * Class choice strategy to calculate discount 
 * @author Stalina
 *
 */
public class DiscountCard {
	private SystemOfDiscounts _discount;

	public DiscountCard(SystemOfDiscounts discount) {
		
		_discount = discount;
	}

	public double Discounter(double sum, int percent) {
		
		return _discount.discountPayment(sum, percent);
	}

}
