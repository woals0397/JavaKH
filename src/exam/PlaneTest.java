package exam;

abstract class Plane{
	private String planeName;
	private int fuelSize;
	
	public Plane() {
	
	}
	
	public Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	public void refuel(int fuel) {
		fuelSize += fuel;
	}
	
	abstract public void flight(int distance);

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
}

class Airplane extends Plane{
	public Airplane() {
		
	}
	
	public Airplane(String PlaneName, int fuelSize) {
		super(PlaneName, fuelSize);
	}
	
	@Override
	public void flight(int distance) {
		setFuelSize(getFuelSize()-3*distance);
	}
	
}

class Cargoplane extends Plane{
	public Cargoplane() {
		
	}
	
	public Cargoplane(String PlaneName, int fuelSize) {
		super(PlaneName, fuelSize);
	}
	
	@Override
	public void flight(int distance) {
		setFuelSize(getFuelSize()-5*distance);
	}
	
	
}

public class PlaneTest {
	public static void main(String[] args) {
		Airplane air = new Airplane("L747", 1000);
		Cargoplane cargo = new Cargoplane("C40", 1000);
		
		System.out.println("Plane          fuelSize");
		System.out.println("------------------------");
		System.out.println(air.getPlaneName() + "            " + air.getFuelSize());
		System.out.println(cargo.getPlaneName() + "             " + cargo.getFuelSize());
		
		System.out.println("100 운항");
		air.flight(100);
		cargo.flight(100);
		System.out.println("Plane          fuelSize");
		System.out.println("------------------------");
		System.out.println(air.getPlaneName() + "            " + air.getFuelSize());
		System.out.println(cargo.getPlaneName() + "             " + cargo.getFuelSize());
	
		System.out.println("200 주유");
		air.refuel(200);
		cargo.refuel(200);;
		System.out.println("Plane          fuelSize");
		System.out.println("------------------------");
		System.out.println(air.getPlaneName() + "            " + air.getFuelSize());
		System.out.println(cargo.getPlaneName() + "             " + cargo.getFuelSize());

	}
}
