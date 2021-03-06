package ua.kiral.project1.vegetables;

public class Potato extends Vegetable {
	public final static double CALORIFIC_VAL_1GR = 0.8;
	public final static String COLOR = "Brown";
	private boolean isOld;

	public Potato(int weight, boolean isOld) {
		super(weight, CALORIFIC_VAL_1GR);
		this.isOld = isOld;
	}

	public boolean isOld() {
		return isOld;
	}

	public void setOld(boolean isOld) {
		this.isOld = isOld;
	}

	@Override
	public String toString() {
		return COLOR + " potato, weight: " + weight + " gramm, is old: " + isOld + ", calorific value: "
				+ calorificValue + " kcal.";
	}
}
