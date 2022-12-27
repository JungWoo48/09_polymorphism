package edu.kh.abs.model.service;

import edu.kh.abs.model.vo.Animal;
import edu.kh.abs.model.vo.Cat;
import edu.kh.abs.model.vo.Chicken;
import edu.kh.abs.model.vo.Dog;
import edu.kh.abs.model.vo.Eagle;
import edu.kh.abs.model.vo.Penguin;
import edu.kh.abs.model.vo.Shark;
import edu.kh.abs.model.vo.TypeBirds;
import edu.kh.abs.model.vo.TypeMammalia;
import edu.kh.abs.model.vo.TypePisces;
import edu.kh.abs.model.vo.Whale;

public class AbstractService {
	//Chicken
	//Eagle
	//Penguin
	//Shark 
	//Whale
	
	//TypeBirds
	//TypeMammalia
	//TypePisces 어류 
	public void ex1() {
		
		Cat cat = new Cat();
		
		Dog dog = new Dog();
		
		Whale whale = new Whale();
		
		Eagle eagle = new Eagle();
		
		Penguin penguin = new Penguin();
		
		Shark shark = new Shark();
		
		Chicken chicken = new Chicken();
		
		TypeMammalia[] mamalia = new TypeMammalia[] {cat, dog, whale };
		TypeBirds[] birds = new TypeBirds[] {chicken, penguin};
		TypePisces[] pissces = new TypePisces[] {shark};
 		
		Animal[] animal = new Animal[] {cat, dog, whale, chicken, penguin, shark};
		
		for(int i = 0; i < animal.length; i++) {
			animal[i].cry();
			animal[i].eat();
			animal[i].move();
			
			//만약 ,animal중에 타입이 고양이 일때
			//수유를 한다는 것을 출력한다면
			if(animal[i] instanceof Cat) {
				System.out.println("===고양이는==="); 
				((Cat)animal[i]).breastfeed();//cat으로 다운 캐스팅 하여 수유메서드를 강제 형변환
												// Cat 클래스에 오버라이딩으로 재 정의 된 내용이 출력
				System.out.println("====이렇다====");
			}
			
			if(animal[i] instanceof Eagle) {
				System.out.println("====독수리는====");
				Eagle eg = (Eagle) animal[i];
				eg.fly();//Typebirds에서 일반 메서드로 정의한 내용
				System.out.println("====이렇다===");
			}
			
			if(animal[i] instanceof Shark) {
				System.out.println("=====상어는====");
				Shark sh = (Shark)animal[i];
				sh.swimming();
				System.out.println("=====이렇다====");
			}
		
			
		}
		
		/*
		dog.cry();
		dog.eat();
		dog.move();
		dog.breastfeed();
		
		cat.cry();
		cat.eat();
		cat.move();
		cat.breastfeed();
		
		eagle.cry();
		eagle.eat();
		eagle.fly();
		eagle.move();
		
		shark.cry();
		shark.eat();
		shark.move();
		shark.swimming();
		*/
		
		
		//Animal animal = new Animal();은 불가능하다
		// 추상클래스는 객체로 만들수 없기때문
		//타입으로서의 역할은 한다
	}
}
