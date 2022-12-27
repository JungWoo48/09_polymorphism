package edu.kh.abs.model.vo;

import edu.kh.inter.model.vo.WaterLife;

public class Whale extends TypeMammalia{

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



}
