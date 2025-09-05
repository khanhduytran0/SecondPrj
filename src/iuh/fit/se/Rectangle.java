/**
 * @description: This class implements a rectangle
 * @author: duy
 * @version: 1.0
 * @created: 4 thg 9, 2025 20:04:04
 */
package iuh.fit.se;

/**
 * A class representing a rectangle
 */
public class Rectangle {
	private double length;
	private double width;
	
	/**
	 * Creates a default rectangle with zero size
	 */
	public Rectangle() {
		this(0.0, 0.0);
	}
	
	/**
	 * @param width
	 * @param length
	 */
	public Rectangle(double width, double length) {
		if(length < 0 || width < 0) {
			throw new IllegalArgumentException("Length and width must be greater than 0");
		}
		setLength(length);
		setWidth(width);
	}

	/**
	 * @return length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length
	 */
	public void setLength(double length) {
		if(length < 0) {
			throw new IllegalArgumentException("Length must be greater than 0");
		}
		this.length = length;
	}
	
	/**
	 * @return width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width
	 */
	public void setWidth(double width) {
		if(width < 0) {
			throw new IllegalArgumentException("Width must be greater than 0");
		}
		this.width = width;
	}

	/**
	 * @return the area of this rectangle object
	 */
	public double getArea() {
		return this.length * this.width;
	}
	
	/**
	 * @return the perimeter of this rectangle object
	 */
	public double getPerimeter() {
		return (this.length + this.width) * 2;
	}
	
	@Override
	public String toString() {
		return String.format("Rectangle [%s x %s], CV: %s, DT: %s", this.width, this.length, getPerimeter(), getArea());
	}
}
