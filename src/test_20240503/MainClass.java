package test_20240503;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("helloworld");
		System.out.println("helloworld");
		System.out.println("helloworld");
		
		int numInt;  // 정수 변수 선언
		numInt = 10; //초기값 설정
		
		double numDouble; // 실수 변수 선언
		numDouble = 3.14;// 초기값 설정
		
		String str;  //문자열 변수 선언 
		str = "Korea"; // 초기값 설정
		
		boolean logi;  //논리형 변수 선언(true. false 만 저장 가능)
		logi = true;   // 초기값 설정
		
		char ch = 'A';   // 문자 변수 선언(1글자 저장)-> 작은 따움표로 저장해야 함 
		
		char ch2 = 65;  // 정수를 char 변수에 저장하면 해당 정수가 가리키는 아스키 코드 문자가 저장
		
		System.out.println(ch2);
		
		
		// 파이썬 : (int)numDouble -> 정수로 형변환
		int dint = (int)numDouble ;
		System.out.println(dint);
		
		double idou = (double)numInt;
		System.out.println(idou);
		
		String strInt = "1000";
		
		// 파이썬: (int)strInt -> 문자열 숫자 -> 정수로 형변환
		//int strSample = (int)strInt;   //Java에서는 임시적 형변환으로 문자열을 숫자(정수, 실수)로 변환 불가함
		
		//Wrapper 클래스를 사용하여 문자열 => 정수(실수) 형변환 해야함
		int strSample = Integer.parseInt(strInt);
		System.out.println(strSample);
		
		String strDouble = "3.14";
		double strSample2 = Double.parseDouble(strDouble);    // 문자열 "3.14 -> 실수 3.14로 변환
		System.out.println(strSample2);
		
		//정수(실수)를 문자열로 변환
		//파이썬 : (str)1000->문자열로 취급
		
		int num1=157;
		
		String numStr1 = String.valueOf(num1); // 문자열 -> 정수로 변환
		
		System.out.println(numStr1);
		
		System.out.println("문자열로 변환된 값:" + numStr1);
		
	}

}
