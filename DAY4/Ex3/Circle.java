import static java.lang.Math.PI;

public class Circle extends Shape{

	@Override
	public double calculateArea(int value) {
		
		super.setValue(value);
		return (PI*this.getValue()*this.getValue());
	}

}
