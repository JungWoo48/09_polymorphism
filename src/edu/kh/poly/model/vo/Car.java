package edu.kh.poly.model.vo;

public class Car {
	/* 자동차라면 가지고 있는것
	 * 
	 */
	private String engine;
	private String fuel;
	private int wheel;
	
	public Car() {//기본 생성자
		super();//기본적으로 보이지 않지만 object를 상속중이다
			//안적으면 컴파일러가 자동으로 해준다
	}

	public Car(String engine, String fuel, int wheel) {
		super();
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}

	public String getEngine() {//getter setter
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
	
	public String tostring() {//엔진 연료 바퀴개수 오버라이딩
		return engine + "/ " + fuel + " / " + wheel;
	}
	
	
	
}
