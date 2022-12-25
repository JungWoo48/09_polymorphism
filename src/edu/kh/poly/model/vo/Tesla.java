package edu.kh.poly.model.vo;

public class Tesla extends Car {//Car 상속
	//전기차
	private int batteryCapacity;
	
	public Tesla() {//기본생성자 닽푹키 ctlr + space + enter
		
	}

	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {//매개변수 생성자
		super(engine, fuel, wheel);
		this.batteryCapacity = batteryCapacity;
	}


	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	@Override
	public String toString() {
		return super.tostring() + " / " + batteryCapacity;// super. == super참조변수
	}
	

}
