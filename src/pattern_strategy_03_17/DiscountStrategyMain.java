package pattern_strategy_03_17;

public class DiscountStrategyMain {

	public static void main(String[] args) {
		DiscountCard Alex = new DiscountCard(new SilverClient());
		System.out.println("Discount Silver client " + Alex.Discounter(1000, 2));
		
		Alex = new DiscountCard(new GoldClient());
		System.out.println("Discount GoldClient " + Alex.Discounter(1000, 2));

		Alex = new DiscountCard(new PlatinumClient());
		System.out.println("Discount Platinum Client " + Alex.Discounter(1000, 2));
		
		
		

	}

}
