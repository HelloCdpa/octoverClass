package java1015;

public class People2 {

	public static void main(String[] args) {
		// 기본 생성자를 활용한 People 클래스 선언
		People p1 = new People();
		// People 클래스 타입의 변수 p1
		
		//필드 활용
		//p1객체의 name필드에 이름1 이라는 데이터 저장
		System.out.println(p1.name);
		p1.name = "이름1";
		System.out.println(p1.name);
		//필드들이 저장 공간을 구성한다.
		People p2 = new People();
		p2.name = "이름2";
		//새로운 변수!
		System.out.println(p1.name);		
		System.out.println(p2.name);
		p1.age = 10;
		p1.nation = "한국";
		System.out.println(p2.age);
		System.out.println(p1.nation);
		System.out.println(p2.nation);
		
		//매개 변수가 있는 생성자를 활용한 객체 생성
		//매개값으로 필드값을 지정
		//자유롭게 바꿀 수 있음
		People p3 = new People("이름3",11,"스위스");//매개값
		
		System.out.println(p3.name);
		System.out.println(p3.age);
		System.out.println(p3.nation);
		
		People p4 = new People("이름4", 22);
		People p5 = new People(22,"이름5");
		People p6 = new People("호주");
		
		System.out.println(p4.name);
		System.out.println(p5.nation);
		System.out.println(p6.nation);
		
		
		
		
		
		
		
	}

}
