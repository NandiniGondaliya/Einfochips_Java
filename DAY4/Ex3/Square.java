
public class Square extends Shape {

	@Override
	public double calculateArea(int value) {
		super.setValue(value);
		return (this.getValue()*this.getValue());
	}

	
}
