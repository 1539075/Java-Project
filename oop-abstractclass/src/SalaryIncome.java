
public class SalaryIncome extends Income {

	private static final double TAX_RATE = 0.1; // 假设工资收入税率是10%

	public SalaryIncome(double income) {
		super.income = income;
	}

	@Override
	public double getTax() {
		return super.income * TAX_RATE;
	}

	// TODO

}
