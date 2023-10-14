
public class ExampleBean {

	// Number of years to calculate the Ultimate Answer
	private final int years;

	// The Answer to Life, the Universe, and Everything
	private final String ultimateAnswer;

	@Override
	public String toString() {
		return "ExampleBean{" +
				"years=" + years +
				", ultimateAnswer='" + ultimateAnswer + '\'' +
				'}';
	}

	public ExampleBean(int years, String ultimateAnswer) {
		this.years = years;
		this.ultimateAnswer = ultimateAnswer;
	}
}