
/**
 * 定义抽象类Income
 */
public abstract class Income {

	// TODO
	public abstract double getTax();
	protected double income;
	public double income(double income) {
		this.income = income;
		return this.income;

	}
	private double getIncome() {
		return this.income;
	}
	private void setIncome(double income) {
		this.income = income;
	}
	

}
