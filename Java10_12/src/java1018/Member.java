package java1018;

public class Member {
	//필드
	String Id, name, Email;
	int password;

	Member() {

	}

	// 회원정보
	Member(String Id, String name, String Email, int password) {
		this.Id = Id;
		this.name = name;
		this.Email = Email;
		this.password = password;
		System.out.println("가입완료");
	}

	void memberJoin(String Id, String name, String Email, int password) {
		this.Id = Id;
		this.name = name;
		this.Email = Email;
		this.password = password;
		System.out.println("가입완료");
	}

	// 로그인 기능

	boolean memberLogin(String inputId, int inputpassword) {
		boolean Login;
		if (inputId.equals(Id) && inputpassword == password) {
			Login = true;
		} else {
			Login = false;
		}

		return Login;
	}

	// 정보 메서드
	void myInfo() {
		System.out.println("Id :" + Id + " name :" + name + " Email :" + Email + " password :" + password);
	}

	// 회원정보 수정기능
	void memberUpdate(String UpdateEmail) {
		this.Email = UpdateEmail;
		System.out.println("변경완료");
		System.out.println(Email);

	}
	//toString 메서드
			//리턴 타입 : String
		
	@Override // 메서드 재정의override할 때 사용하는 @어노테이션(Annotation)
	public String toString() {
		return "Member [Id=" + Id + ", name=" + name + ", Email=" + Email + ", password=" + password + "]";
	}
	
	//overloading 매개변수가 있는 상속자를 많이 만드는 것 Vs overriding 메서드를 재정의 하는 것
	
	//매개변수에도 모든 타입이 올 수 있다.
	//리턴도 모든 타입이 올 수 있다.
	boolean memberLogin2(Member loginMember) {
		boolean Login;
		if (loginMember.Id.equals(Id) && loginMember.password == password) {
			Login = true;
		} else {
			Login = false;
		}
		System.out.println(Login);
		return Login;
	}
	
	
	
	
	
}










