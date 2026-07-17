package homework_4;

public class Rectangle {
	double width;
	double height;

	Rectangle() {
		this(1, 1);
	}

	Rectangle(double side) {
		this(side, side);
	}

	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	double getArea() {
		return width * height;
	}

	double getPerimeter() {
		return 2 * (width + height);
	}

	boolean isSquare() {
		return width == height;
	}

}