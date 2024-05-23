class Vehicle
{
	protected String regnNumber;
	protected int speed;
    protected String color;
    protected String ownerName;
	
    public Vehicle(String regnNumber,int speed, String color, String ownerName)
	{
		this.regnNumber=regnNumber;
		this.speed=speed;
		this.color=color;
		this.ownerName=ownerName;
	}	
	
	public void showData()
	{
		System.out.println("This is a vehicle class");
		System.out.println("Registration no.: "+regnNumber);
		System.out.println("Speed: "+speed);
		System.out.println("Colour: "+color);
		System.out.println("Owner: "+ownerName);
	}
}
class Bus extends Vehicle
{
	private int routeNumber;
	public Bus(String regnNumber,int speed, String color, String ownerName,int routeNumber)
	{
		super(regnNumber,speed,color,ownerName);
		this.routeNumber=routeNumber;
	}
	public void showData()
	{
		super.showData();
		System.out.println("Route Number: "+routeNumber);
	}
}
class Car extends Vehicle
{
	private String manufacturerName;
	public Car(String regnNumber,int speed, String color, String ownerName,String manufacturerName)
	{
		super(regnNumber,speed,color,ownerName);
		this.manufacturerName=manufacturerName;
	}
	public void showData()
	{
		super.showData();
		System.out.println("Manufacturer: "+manufacturerName);
	}
}
class Q16
{
	public static void main(String[]args)
	{
	Bus b1=new Bus("MH12HB1234",200,"Red","Government of Maharashtra",5);
	b1.showData();
	Car c1=new Car("MH12RJ7338",180,"Blue","Vadiraj Tadas","Tata");
	c1.showData();
	}
}