package ua.kiral.project1.dishes;

import java.util.Comparator;

import ua.kiral.project1.vegetables.Vegetable;

public class Salad {

	private Vegetable[] ingredients;
	private int currentIndex = 0;
	private final static int DEFAULT_CAPASITY = 10;

	public Salad(int saladCapasity) {
		this.ingredients = new Vegetable[saladCapasity];
	}

	public Salad() {
		this(DEFAULT_CAPASITY);
	}

	public Vegetable[] getIngridients() {
		return ingredients;
	}

	/**
	 * Returns total value of calories in this salad.
	 * 
	 * @return
	 */
	public int getOverallCalorificValue() {
		int total = 0;
		for (Vegetable vegetable : ingredients) {
			if (vegetable == null)
				break;
			total += vegetable.getCalorificValue();
		}
		return total;
	}

	/**
	 * Adds ingredient to salad. Returns true if succeed, and false if salad is
	 * full.
	 * 
	 * @param ingridient
	 * @return
	 */
	public boolean addIngredient(Vegetable ingridient) {
		if (currentIndex < ingredients.length) {
			ingredients[currentIndex] = ingridient;
			currentIndex++;
			return true;
		} else
			return false;
	}

	/**
	 * Removes ingredient from salad. Returns true if succeed, and false id
	 * salad is empty.
	 * 
	 * @return
	 */
	public boolean removeIngredient() {
		if (currentIndex >= 0) {
			ingredients[currentIndex] = null;
			currentIndex--;
			return true;
		} else
			return false;
	}

	/**
	 * Returns first-to-find ingredient, which suits inserted conditions.
	 * 
	 * @param fromCalorificValue
	 *            - lower value, inclusive
	 * @param toCalorificValue
	 *            - higher value, inclusive
	 * @return
	 */
	public Vegetable getIngredient(int fromCalorificValue, int toCalorificValue) {
		for (Vegetable vegetable : ingredients) {
			if (vegetable == null)
				break;
			if (vegetable.getCalorificValue() >= fromCalorificValue
					&& vegetable.getCalorificValue() <= toCalorificValue) {
				return vegetable;
			}
		}
		return null;
	}

	/**
	 * Sorts this salad by ingredients weight, ascending.
	 */
	public void sortIngredients() {
		for (int i = 0; i < currentIndex; i++) {
			int minIndex = i;
			for (int j = i; j < currentIndex; j++) {
				if (ingredients[j].getWeight() < ingredients[minIndex].getWeight()) {
					minIndex = j;
				}
			}
			Vegetable temp = ingredients[i];
			ingredients[i] = ingredients[minIndex];
			ingredients[minIndex] = temp;
		}
	}

	/**
	 * Sorts this salad according to the order induced by the specified
	 * {@link Comparator}.
	 * 
	 * @param comp
	 */
	public void sortIngredients(Comparator<Vegetable> comp) {
		for (int i = 0; i < currentIndex; i++) {
			int minIndex = i;
			for (int j = i; j < currentIndex; j++) {
				if (comp.compare(ingredients[j], ingredients[minIndex]) > 0) {
					minIndex = j;
				}
			}
			Vegetable temp = ingredients[i];
			ingredients[i] = ingredients[minIndex];
			ingredients[minIndex] = temp;
		}
	}
}
