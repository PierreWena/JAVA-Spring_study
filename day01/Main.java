package my.day01;

public class Main {

	// 콘솔프로그램의 실행은 main(String[] args) 메소드에 실행한다.
	public static void main(String[] args) {
		
		// 1명의 새로운 회원이 필요하다.
		Member lssmbr = new Member(); // 이순신
		// lssmbr 을 Member 클래스의 객체(== 인스턴스)라고 부른다. 
		
		System.out.println("lssmbr : " + lssmbr);
		// lssmbr : my.day01.Member@15db9742
		// @다음에 나오는 16진수의 값은 메모리(RAM)상의 위치(주소)를 가리키는 것이다.
		
		lssmbr.id = "leess"; // = 은 어떤 값을 어떤 변수에 대입한다(넣어준다)라는 뜻이다.  
		lssmbr.pwd = "abcd";
		lssmbr.name = "이순신";
		lssmbr.email = "leess@naver.com";
		
		
		// 또 1명의 새로운 회원이 필요하다.
		Member eomjhmbr = new Member(); // 엄정화
		
		System.out.println("eomjhmbr : " + eomjhmbr);
		// eomjhmbr : my.day01.Member@6d06d69c
		// @다음에 나오는 16진수의 값은 메모리(RAM)상의 위치(주소)를 가리키는 것이다.
		
		eomjhmbr.id = "eomjh"; // = 은 어떤 값을 어떤 변수에 대입한다(넣어준다)라는 뜻이다. 
		eomjhmbr.pwd = "qwer1234";
		eomjhmbr.name = "엄정화";
		eomjhmbr.email = "eomjh@gmail.com";
		
		////////////////////////////////////////////////////
		
		lssmbr.showInfo();   // lssmbr 인스턴스(객체)에 대한 회원정보 출력하기 
		eomjhmbr.showInfo(); // eomjhmbr 인스턴스(객체)에 대한 회원정보 출력하기
		
		///////////////////////////////////////////////////////////////////
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		lssmbr.address = "인천광역시 송도구";
		
		lssmbr.showInfo();   // lssmbr 인스턴스(객체)에 대한 회원정보 출력하기 
		eomjhmbr.showInfo(); // eomjhmbr 인스턴스(객체)에 대한 회원정보 출력하기
		
        System.out.println("\n######################################\n");
		
		eomjhmbr.address = "서울특별시 마포구";
		
		lssmbr.showInfo();   // lssmbr 인스턴스(객체)에 대한 회원정보 출력하기 
		eomjhmbr.showInfo(); // eomjhmbr 인스턴스(객체)에 대한 회원정보 출력하기
		
		
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
		
		Member.address = "경기도 군포시";
		// static 변수는 클래스명.static변수명 으로 사용한다.
		
		lssmbr.showInfo();   // lssmbr 인스턴스(객체)에 대한 회원정보 출력하기 
		eomjhmbr.showInfo(); // eomjhmbr 인스턴스(객체)에 대한 회원정보 출력하기
		
	}

}
