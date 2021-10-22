package java1020;

import java.util.*;

public class StudentMain {

	public static void main(String[] args) {
		
		//Student 객체를 담을 수 있는 ArrayList
		List<Student> studentList = new ArrayList<>();
		
		//Student 객체 선언
		Student stu1 = new Student();
		stu1.name = "학생1";
		stu1.age = 12;
		stu1.studentNumber = "20140804";
		
		Student stu2 = new Student("헤린",12,"1040203");
		
		//Student 객체를 list에 저장
		studentList.add(stu1);
		studentList.add(stu2);
		
		//Student 객체가 가지고 있는 필드값 출력
		System.out.println(studentList.get(0).name);
		System.out.println(studentList.get(1).name);
		
		//stu1 이 가지고 있는 (0번인덱스)view메서드 호출
		studentList.get(0).view();
		
		//리턴값의 유무에 따라 달라짐
		System.out.println(studentList.get(1).toString());
		
		//studentList에 담긴 stu2의 이름 변경
		studentList.get(1).name = "학생2 이름변경";
		
		//foreach 스튜던트리스트의 데이터값으로 써줘야함
		for (Student s: studentList) {
			System.out.println(s.name);
			System.out.println(s.toString());
			s.view();
			
		}
		
		for (int i=0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i).toString());
			System.out.println(studentList.get(i).name);
			studentList.get(i).view();
		}
		
		
		
		
		
		
			
		
		
		
	}

}
