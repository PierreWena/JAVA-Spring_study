package my.day04.c.scanner;

//import java.util.InputMismatchException;
//import java.util.Scanner;
import java.util.*;

public class Scanner2Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 => ");
		
		try {
		 	int inputNum = sc.nextInt(); // 2023엔터 (정상)
		 	                             // 안녕하세요엔터 (오류)
		 	                             // 23423423423423423423423423423423432엔터 (오류)
		 	                             // 1.2321321엔터 (오류)
		 	sc.nextLine();
		 	
		 	System.out.println("입력한 정수 : " + inputNum);
		} catch(InputMismatchException e) {
			System.out.println(">>> 정수만 입력하세요!! <<< \n");
		}
		
		sc.close();
	}

}
