package ua.kiral.project1.vegetables;

public class Pease extends Vegetable {
	public final static double CALORIFIC_VAL_1GR = 0.73;
	public final static String COLOR = "Green";
	private int peaInPod;
	private int podLength;

	public Pease(int weight, int peaInPod, int podLength) {
		super(weight, CALORIFIC_VAL_1GR);
		this.peaInPod = peaInPod;
		this.podLength = podLength;
	}

	public int getPeaInPod() {
		return peaInPod;
	}

	public void setPeaInPod(int peaInPod) {
		this.peaInPod = peaInPod;
	}

	public int getPodLength() {
		return podLength;
	}

	public void setPodLength(int podLength) {
		this.podLength = podLength;
	}

	@Override
	public String toString() {
		return COLOR + " pease, weight: " + weight + " gramm, pod length: " + podLength + " mm., pea in pod: " + peaInPod
				+ ", calorific value: " + calorificValue + " kcal.";
	}
}
