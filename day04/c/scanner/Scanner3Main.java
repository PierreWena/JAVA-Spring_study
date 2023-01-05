package my.day04.c.scanner;

import java.util.*;

public class Scanner3Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 => ");
		
		
		 	String inputStr = sc.nextLine(); // "2023"엔터 (정상)
		 	                                 // "안녕하세요"엔터 (오류)
		 	                                 // "23423423423423423423423423423423432"엔터 (오류)
		 	                                 // "1.2321321"엔터 (오류)
		 	
		 	inputStr + 10;  // "2023" + 10 ==> 202310
		 	
		 	System.out.println("입력한 정수에 10을 더한 값 : " + inputNum);
		
		
		sc.close();
	}

}
