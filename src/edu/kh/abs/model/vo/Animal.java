package edu.kh.abs.model.vo;

public abstract class Animal {
	//abstract 가 붙는 순간 객체화가 안되는 클래스가 된다(인스턴스가 되지 않는다)
	//단, 타입으로서의 의미는 그대로이다.
	public abstract void  eat();
	//추상 메서드는 어떤 동작을 할지 정하지 않는다 == 구체화 X == 중괄호를 쓰지 않는다
	//+ 추상메서드는 추상클래스안에 있어야 한다
	
	public abstract void cry();
	
	public abstract void move();
}
