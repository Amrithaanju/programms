package Abstraction;

public class VehicleApp {
	public static void main(String[]args) {
		//creating objects
		ElectricVehicle ev=new ElectricVehicle();
		PetrolVehicle pv=new PetrolVehicle();
		DieselVehicle dv=new DieselVehicle();
		//calling and passing objects
		VehicleApp va=new VehicleApp();
		va.drive(ev);
		va.drive(pv);
		va.drive(dv);
	}
	public void drive(Vehicle v) {
		//accessing inherited methods
		v.start();
		v.stop();
		//accessing overriden methods
		v.refuel();
	}

}
abstract class Vehicle{
	public void start()
	{
		System.out.println("Vehicle started");
		
	}
	public void stop()
	{
		System.out.println("Vehicle stopped");
		
	}
	
	abstract public void refuel();
}
class ElectricVehicle extends Vehicle
	{
	public void refuel()
	{
		System.out.println("Charge Vehicle");
		
	}
	
}
class PetrolVehicle extends Vehicle
{
	public void refuel() {
		System.out.println("Refuel using petrol");
	}
}
	class DieselVehicle extends Vehicle
	{
		public void refuel() {
			System.out.println("Refuel using diesel");
		}
	}
	








