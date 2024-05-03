package test_20240503;

import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//파이썬의 input문과 동일한 기능
		Scanner scanner;   //스캐너 클래스로 객체를 하나 선언
		scanner = new Scanner(System.in);  //객체를 초기화 하려면 new 연산자를 처음에 기입해야 함
		/// Scanner scanner = new Scanner(System.in);
		// 시스템의 입력장치로부터 유저가 입력한 내용을 입력받을 수 있도록 초기화

		System.out.print("당신의 이름을 입력하세요:");
		String inputData = scanner.nextLine(); //엔터키를 치기 전까지 입력된 문자열을 가져옴
		
		System.out.println(inputData);
	}

}
