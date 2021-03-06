package ua.kiral.project1.vegetables;

public class Tomato extends Vegetable {
	public final static double CALORIFIC_VAL_1GR = 0.2;
	private String fruitKind;
	private String color;

	public Tomato(int weight, String fruitKind, String color) {
		super(weight, CALORIFIC_VAL_1GR);
		this.fruitKind = fruitKind;
		this.color = color;
	}

	public String getFruitKind() {
		return fruitKind;
	}

	public void setFruitKind(String fruitKind) {
		this.fruitKind = fruitKind;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return color + " tomato, weight: " + weight + " gramm, fruit sort: " + fruitKind + ", calorific value: "
				+ calorificValue + " kcal.";
	}
}
