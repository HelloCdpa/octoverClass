package java1018;

public class MemberMain {

	public static void main(String[] args) {
		Member member = new Member("phl1021", "혜린", "phl1021@naver.com", 1234);
		System.out.println(member.Id);
		System.out.println(member.name);
		System.out.println(member.password);
		System.out.println(member.Email);

		Member member2 = new Member();
		member2.memberJoin("zxc123", "민정", "min1021@naver.com", 1357);

		boolean result = member.memberLogin("phl1021", 1234);

		if (result) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

		member2.myInfo();

		member2.memberUpdate("nana123@naver.com");

		System.out.println(member);
		
		
		//로그인 정보 전달을 위한 Member 객체생성
		Member loginMember = new Member();
		loginMember.Id = "id1";
		loginMember.password = 1234 ;
		
		//loginMember 객체를 memberLogin2 메서드에 전달
		result = member.memberLogin2(loginMember);
	}
	
	
	
	
	
	
	
	
	
	
		
}










