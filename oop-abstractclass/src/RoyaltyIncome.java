
/**
 * 稿费收入税率是20%
 */
public class RoyaltyIncome extends Income {

	// TODO
	public RoyaltyIncome(double income) {
		// TODO Auto-generated constructor stub
		super.income = income;
	}
	@Override
	public double getTax() {
		return super.income * 0.2;
	}

}
