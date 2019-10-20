package solid;
//***********************  Single Responsibility Concept *************
//Concept - Class should have only one reason to change

public class SingleResponsibility {
public static void main(String[] args) {
	}
}
//Class described bellow has a lot of reason to change for each separate case, such salary or cleanAlley
class Employee{
	int getSalary() {return 10;}
	void cook() {}
	void cleanAlley() {}
}
//************** Here how it should be realized depend on Single responsibility principle  ************* 
interface Employees{
	int getSalary();}
class Cook implements Employees{
	@Override
	public int getSalary() {return 20;}
void cook() {System.out.println("I am preparing food");}}
class Janitor implements Employees{
	@Override
public int getSalary() {return 34;}
	public void cleaning() {System.out.println("I am cooking");}} 