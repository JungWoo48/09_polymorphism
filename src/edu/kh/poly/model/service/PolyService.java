package edu.kh.poly.model.service;

import edu.kh.poly.model.vo.Car;
import edu.kh.poly.model.vo.Spark;
import edu.kh.poly.model.vo.Tesla;

public class PolyService {
	
	//*************다형성 (업캐스팅) **************
	public void ex1() {
		//다형성 확인 예제
		
		//car 객체 생성
		Car car = new Car();
		//부모 타입 참조변수 = 부모객체
		
		//Tesla 객체생성
		Tesla tesla = new Tesla();
		//자식 타입 참조 변수
		
		//=============업캐스팅 구간
		Car car2 = new Tesla();
		//Tesla 객체를 참조 하는 뱐수타입이 car(부모)이기 떄문에
		//Tesla 객체가 car(부모) 객체로 변화함
		//부모타입 참조변수 = 자식객체
		
		
		
		// ****** 다형성 업 캐스팅 작성법*****
		//1) 자식 객체가 부모객체로 변하였기 떄문에
		// 	 자식만의 고유한 필드, 메소드를 사용불가능
		
		//=================
		
		//2 ) 다형성을 이용한 객체 배열
		// 객체배열 : 같은 (객체참조) 자료형의 변수를 하나의 묶음으로 다루는것
				//같은 객체 = > 부모타입으로 바꿈
				//부모 타입 참조 자료형
		// + 다형성을 적용 -> 부모타입 참조 자료형의 변수를 하나의 묶음으로 다루는것
		
		Car[] arr = new Car[3];//부모타입 참조변수 배열 선언 및 할당
								// 각 배열 요소 Car타입 참조변수
		
		arr[0] = car; // Car주소 == Car객체(Car주소는 Car타입 객체)
		//arr[0] car 참조변수
		arr[1] = car2;// tesla 주소 == tesla객체
		
		//상속 + 다형성
		// 상속 특징 : 일련의 클래스들에 대한 공통적인 규약 정의
		//			-> Car 상속 클래스는 모두 getEngine() 을 가지고 있다를 정의
		// 다형성(업캐스팅): 부모 타입 참조변수 arr[i]로 자식 객체를 참조할수 있다.
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + "번째 인데스의 엔진" + arr[i].getEngine());
		}
		
		
	}
	
	public void ex2() {
		
		//2) 다형성(업캐스팅)을 이용한 **매개변수** 사용법
		//Tesla t = new Tesla("전기모터", "전기", 4 , 100000);
		
		Car c = new Car("경유 엔진", "경유", 12);
		
		
	}
	//전달받은 Car또는 자식 객체의 속성을 출력하는 메서드
	public void printCar(Car temp) {
		System.out.println("엔진: " + temp.getEngine());
		System.out.println("연료: " + temp.getFuel());
		System.out.println("바퀴 갯수: " + temp.getWheel());
		System.out.println();
		
		
		
	}
	
	public void ex3() {
		//다운 캐스팅이란
		//부모타입 첨조변수가 자식객체를 참조한느 
		//**업캐스팅 상태**에서만 진핼할수 있는 기술
		//부모 타입을 자식타입으로 "강제 형변환" 해서
		// 자식 객체의 본래 필드, 메소드를 사용가능하게 하는것
		
	}

}
