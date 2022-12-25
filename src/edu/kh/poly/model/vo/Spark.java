package edu.kh.poly.model.vo;

public class Spark {//경차
		
	private double discountoffer;
	
	public Spark() {
		// TODO Auto-generated constructor stub
	}



	public Spark(double discountoffer) {
		super();
		this.discountoffer = discountoffer;
	}

	public double getDiscountoffer() {
		return discountoffer;
	}

	public void setDiscountoffer(double discountoffer) {
		this.discountoffer = discountoffer;
	}
	@Override
	public String toString() {
		return super.toString() + " / " + discountoffer;
	}
	
}
