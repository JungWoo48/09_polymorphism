package edu.kh.inter.model.vo;

public class Shark extends TypePisces implements WaterLife {

	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		System.out.println("상어가 수영한다");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("상어가 먹는다");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("상어가 소리낸다");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("상어가 움직인다");
	}

	@Override
	public void water() {
		// TODO Auto-generated method stub
		System.out.println("상어는 물속의 포식자이다.");
	}
	
	

}
