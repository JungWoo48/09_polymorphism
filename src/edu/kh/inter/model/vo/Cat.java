package edu.kh.inter.model.vo;

public class Cat extends TypeMammalia{
	
	public void eat() {
		System.out.println("고양이가 밥을 먹는다");
	}

	@Override
	public void cry() {
		System.out.println("고양이가 운다");
	}

	@Override
	public void move() {
		System.out.println("고양이가 움직인다");
		
	}

	@Override
	public void breastfeed() {
		// TODO Auto-generated method stub
		System.out.println("고양이가 수유를 한다");
	}
	
}
