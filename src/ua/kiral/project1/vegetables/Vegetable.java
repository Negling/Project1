package ua.kiral.project1.vegetables;

public abstract class Vegetable {
	protected int weight;
	protected int calorificValue;

	protected Vegetable(int weight, double calorValForGramm) {
		this.weight = weight;
		this.calorificValue = (int) (weight * calorValForGramm);
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weigth) {
		this.weight = weigth;
	}

	public int getCalorificValue() {
		return calorificValue;
	}

	public void setCalorificValue(int calorificValue) {
		this.calorificValue = calorificValue;
	}
}
