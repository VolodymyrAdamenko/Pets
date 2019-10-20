package solid;
//                      OPEN      CLOSE
//******* Open/Close principle - class should be open for extension, but close for modification *******
public class Open_ClosePrinciple {
	public static void main (String[] args) {
		//  Here we are implementing interface through respective classes without changes in code. Code remains same, only objects are changed, COOL
		Car car1 = new Van();
		Car car2 = new MicroVan();
		getOrder(car1);
		getOrder(car2);
	}
	static void getOrder(Car car) {
		car.workInTaxi();
	}}
interface Car{
	void workInTaxi();
}
//in this class concrete Van can take 10 passengers 
class Van implements Car{
	@Override
  public void workInTaxi() {
		this.getPassangers();
	}
	public void getPassangers() {
	System.out.println("I can take 10 passengers at a time");	
	}}
// in this class concrete MicroVan can managed only with one passenger
class MicroVan extends Van{
	public void getPassanger() {
		System.out.println("I can get only 1 passenger at a time");
	}
	@Override
	public void workInTaxi() {
		this.getPassanger();
	}}