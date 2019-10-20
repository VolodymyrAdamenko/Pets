package solid;
// ********************************** Liskov Substitution Principle ***************
/**
 * Principle is told that all inherited class in case of polymorphism should not change behaving predictively, without program logic changing
 * Look at the example below.
 */
public class LiskovSubstitution {
//	//In this case we create new Rectangle object, and everything looks fine 
// public static Rectangle getRectangle () {
//	 return new Rectangle();
// }
	//as well as Square is also Rectangle object, but with overrided behavior we get an another output on Square Method
	// To avoid this , we should provide our app with additional interface. And discard inheritance.!!!!
	public static Rectangle getRectangle() {
		return new Square();
	}
	public static void main (String[] args) {
	Rectangle rectangle = LiskovSubstitution.getRectangle();
	rectangle.setSide_a(10);
	rectangle.setSide_b(30);
	System.out.println(rectangle.getSquare());
	 }}
class Rectangle{
	 int side_a;
	 int side_b;
	public int getSide_a() {
		return side_a;
	}
	public void setSide_a(int side_a) {
		this.side_a = side_a;
	}
	public int getSide_b() {
		return side_b;
	}
	public void setSide_b(int side_b) {
		this.side_b = side_b;
	}
	//inhere square expression method
	public int getSquare() {
		return (side_a*side_b);
	}
}
//in this Class we Override both methods from parent Class, and made some changes, because of Square sides equality
class Square extends Rectangle{
	@Override
	public void setSide_a(int side_a) {
		this.side_a = side_a;
		side_b = side_a;
	}
	public void setSide_b(int side_b) {
		this.side_b = side_b;
		side_a=side_b;
	}
}