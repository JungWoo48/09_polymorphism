package edu.kh.inter.model.vo;

public class Penguin extends TypeBirds implements WaterLife{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("펭귄이 먹는다");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("펭귄이 운다");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("펭귄이 움직인다");
	}

	@Override
	public void water() {
		// TODO Auto-generated method stub
		System.out.println("펭귄은 물속에서 더 빠르다");
	}

}
