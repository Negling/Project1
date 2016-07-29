package ua.kiral.project1.main;

import ua.kiral.project1.dishes.Salad;
import ua.kiral.project1.vegetables.*;

public class Main {

	public static void main(String[] args) {
		// 1.Creating an instance of vegetable salad
		Salad toastyOne = initialize();

		// 2.Calculating total calorific value of our salad
		System.out.println("Overall salad calorific value - " + toastyOne.getOverallCalorificValue());
		System.out.println("----------------------------------");

		// 3.Sorting vegetables by their weight
		toastyOne.sortIngredients();
		for (Vegetable ingredient : toastyOne.getIngridients()) {
			if (ingredient == null)
				break;
			System.out.println(ingredient);
		}
		System.out.println("----------------------------------");

		// 4.Trying to find a vegetable in our salad with calorific value from selected diapason
		System.out.println(toastyOne.getIngredient(10, 40));
	}

	/**
	 * Returns a simple instance of Salad, with random-weighted vegetables, made just for example.
	 * @return Salad with 7 vegetables
	 */
	private static Salad initialize() {
		Salad temp = new Salad();
		temp.addIngredient(new Cabbage((int) (Math.random() * 100 + 20), 20));
		temp.addIngredient(new Carrot((int) (Math.random() * 100 + 20), "Red", "Oval"));
		temp.addIngredient(new Cucumber((int) (Math.random() * 100 + 20), 300, "Sharp"));
		temp.addIngredient(new Pease((int) (Math.random() * 100 + 20), 8, 20));
		temp.addIngredient(new Potato((int) (Math.random() * 100 + 20), false));
		temp.addIngredient(new Radish((int) (Math.random() * 100 + 20), true, "White"));
		temp.addIngredient(new Tomato((int) (Math.random() * 100 + 20), "Hurma", "Red"));
		return temp;
	}
}
