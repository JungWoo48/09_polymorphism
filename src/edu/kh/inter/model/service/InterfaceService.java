package edu.kh.inter.model.service;

import edu.kh.inter.model.vo.Cat;
import edu.kh.inter.model.vo.Chicken;
import edu.kh.inter.model.vo.Dog;
import edu.kh.inter.model.vo.Eagle;
import edu.kh.inter.model.vo.Penguin;
import edu.kh.inter.model.vo.Shark;
import edu.kh.inter.model.vo.Whale;
import edu.kh.inter.model.vo.TypeMammalia;
import edu.kh.inter.model.vo.WaterLife;
import edu.kh.inter.model.vo.Animal;

public class InterfaceService {
 
	public void ex1() {
		
Cat cat = new Cat();
		
		Dog dog = new Dog();
		
		Whale whale = new Whale();
		
		Eagle eagle = new Eagle();
		
		Penguin penguin = new Penguin();
		
		Shark shark = new Shark();
		
		Chicken chicken = new Chicken();

		WaterLife[] waterLife = new WaterLife[] {whale, penguin, shark};
		
		for(int i = 0; i < waterLife.length; i++) {
			waterLife[i].water();
			//관계가 전혀 없는 것들의 관계를 만들어 주는것이 인터페이스
			//wateLife라는 인터페이스가 고래 상어 펭귄을 묶어준다
		}
		
	}
	
}
