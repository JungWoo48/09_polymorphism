package edu.kh.abs.model.vo;

public class Chicken extends TypeBirds {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("닭이 모이를먹는다");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("닭이 운다");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("닭이 움직인다");
	}

}
