package java1019;

public class Board {
	
	int count;
	String title= null,writer= null,content= null;
	

	Board(){
		
	}
	
	void boardWrite(String title,String writer,String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	
	void boardView () {
		count +=1;
		
		System.out.println("제목 : " + this.title);
		System.out.println("작성자 : " + this.writer);
		System.out.println("글 내용 : " + this.content);
		System.out.println("조회수 : " + count);
		
	}
	
	void boardUpdate (String Uptitle, String Upcontent) {
	
		this.title = Uptitle;
		
		this.content = Upcontent;
		
		System.out.println("수정 완료");

		System.out.println("제목 : " + this.title);
		System.out.println("작성자 : " + this.writer);
		System.out.println("글 내용 : " + this.content);
		
	}
	
	
	
	
}
