class Vehicle
{
	public void startEngine()
	{
		System.out.println("Vehicle Engine Started");
	}
	public void stopEngine()
	{
		System.out.println("Vehicle Engine Stopped");
	}
}
class Car extends Vehicle
{
	public void startEngine()
	{
		System.out.println("Car Engine Started");
	}
	public void stopEngine()
	{
		System.out.println("Car Engine Stopped");
	}
}
class Motorcycle extends Vehicle
{
	public void startEngine()
	{
		System.out.println("Motorcycle Engine Started");
	}
	public void stopEngine()
	{
		System.out.println("Motorcycle Engine Stopped");
	}
}
class Q15b
{
	public static void main(String[]args){
	Car c1=new Car();
	c1.startEngine();
	c1.stopEngine();
	
	Motorcycle m1=new Motorcycle();
	m1.startEngine();
	m1.stopEngine();
	}
}