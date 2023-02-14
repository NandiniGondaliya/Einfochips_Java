
public abstract class Shape {

	private int value;
	
	abstract public double calculateArea(int value);

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
