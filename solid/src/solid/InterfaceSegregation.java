package solid;

//******************** Interface Segregation **************
//Concept told Us that instead of using interfaces with many declared methods we suppose to divide those methods between separate interfaces 

public class InterfaceSegregation{

	  static void myName() {
		 System.out.println("My name is Jilberto");
	 }
	
public static void main(String[] args) {
 
}}

//Bad Practice. Classes implements this interface relay on many method, which, perhaps they are not required
interface CanDo{
	void canDoJob();
	void canDoExercises();
	void canDoMiracle();
}
//Good Practice
interface CanDoJob{
	void canDoJob();
	static void myName() {
		System.out.println ("My name is bob");
	}}
	
	interface CanDoMiracle{
	void canDoMiracle();
	default void myName() {
		System.out.println("My name is Junk");
	}
}

