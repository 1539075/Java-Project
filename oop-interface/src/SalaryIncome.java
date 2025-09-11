
public class SalaryIncome implements Income {
	private static final double TAX_RATE = 0.1; // 假设工资收入税率是10%


	// TODO
	private double income;

	public SalaryIncome(double income) {
		this.income = income;
	}
	public double getTax() {
		return income * TAX_RATE;
	}

}
