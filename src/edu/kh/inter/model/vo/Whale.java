package edu.kh.inter.model.vo;

public class Whale extends TypeMammalia implements WaterLife{

	@Override
	public void breastfeed() {
		// TODO Auto-generated method stub
		System.out.println("고래는 수유하지 않는다");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("고래가 먹는다");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("고래가 운다");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("고래가 움직인다");
	}

	@Override
	public void water() {
		// TODO Auto-generated method stub
		System.out.println("고래는 물에서 살지만 아가미가 없다");
	}

}
